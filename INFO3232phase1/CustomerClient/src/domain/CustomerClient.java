/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author devpu550
 */
public class CustomerClient {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Client client = new Client(); 
      WebResource res = client.resource("http://localhost:8081/customers/");
      
      CustomerIDs customerIDs = res.get(CustomerIDs.class);
      System.out.println(customerIDs);
      
      Customer rawCustomer2 = res.path("1234").get(Customer.class);
      System.out.println(rawCustomer2);
         res.post(new Customer(456, "rambha", 15,"august","female"));
      Customer cust = res.path("456").get(Customer.class);
      cust.setName("Grumpy Ginger");
      res.path("456").put(cust);
      System.out.println(res.get(CustomerIDs.class));
      System.out.println(res.path("456").get(Customer.class));
    
    res.path("456").delete();
//      System.out.println(res.get(CustomerIDs.class).g);
     customerIDs = res.get(CustomerIDs.class);
      System.out.println(customerIDs);
   }
}
