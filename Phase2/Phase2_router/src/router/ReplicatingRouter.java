/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package router;

import domain.Customer;
import javax.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 *
 * @author devpu550
 */
public class ReplicatingRouter {
   public static void main(String[] args) throws Exception {
 /* Basic camel setup */
// create default context
CamelContext camel = new DefaultCamelContext();

// register ActiveMQ as the JMS handler
ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
camel.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));

/* End basic setup */
/* Create the routes */
camel.addRoutes(new RouteBuilder() {

   @Override
   public void configure() {

 //queue contains objects
 from("websocket://localhost:9002/sign") //Protocol : Websocket, Server address local, Port 9002
                    .log("Customer : ${body}")
                    .to("jms:queue:customer-json");
 
 from("jms:queue:customer-json")
  .unmarshal().json(JsonLibrary.Jackson,Customer.class)
     .to("jms:queue:devCustomer-custObj");
 
 from("jms:queue:devCustomer-custObj")
                    .multicast()
                    .to("jms:queue:OUTsoap", "jms:queue:OUTrest");
  
 from("jms:queue:OUTsoap")
                    .to("cxf:http://localhost:9001/signService?serviceClass=sign.ISignService&defaultOperationName=signCalculator")
                    .split().body()  
                    .to("jms:queue:final-sign");
 
 from("jms:queue:final-sign")
         .to("websocket://localhost:9002/sign");
         
from("jms:queue:OUTrest")//Customer obj
                    .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                    //convert todoItems to xml 
                    .setHeader("Content-Type", constant("text/xml"))
                    .marshal().jaxb("domain") 
                    // "domain" is the package that holds the Product cla
                    .to("http4://localhost:8081/customers/");
   }
});

/* Start the router */
// turn exchange tracing on or off (false is off)
camel.setTracing(false);

// start routing
System.out.println("Starting router...");
camel.start();
System.out.println("... ready.");
   }
}
