/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import dao.CustomerDAO;
import domain.Customer;
import domain.CustomerIDs;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author devpu550
 */

@Path("/customers/")
public class CustomersResource {
   
   CustomerDAO resourceDao = new CustomerDAO();
   
   @GET
   public CustomerIDs getCustomers(){
     //return resourceDao.getAll();
      return resourceDao.getIDs();
   }
   
   @POST
   public void createCustomer(Customer customerA){
      System.out.println("soaps working ahoy captain");
      resourceDao.create(customerA);
   }
   
   
   
}
