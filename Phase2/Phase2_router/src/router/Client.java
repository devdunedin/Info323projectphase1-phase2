/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package router;

import domain.Customer;
import javax.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

/**
 *
 * @author devpu550
 */
public class Client {
   public static void main(String[] args) throws Exception {
 /* Basic camel setup */
// create default context
CamelContext camel = new DefaultCamelContext();

// register ActiveMQ as the JMS handler
ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
camel.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));

/* End basic setup */
// create message producer
ProducerTemplate producer = camel.createProducerTemplate();

//Customer Account only one used for testing some time
Customer devCustomer = new Customer(4567, "DEV", 9, "August", "male");
ObjectWriter mapper = new ObjectMapper().writerWithDefaultPrettyPrinter();
String  json = mapper.writeValueAsString(devCustomer);
// send a message
producer.sendBody("jms:queue:customer-json", json);
   }
}
