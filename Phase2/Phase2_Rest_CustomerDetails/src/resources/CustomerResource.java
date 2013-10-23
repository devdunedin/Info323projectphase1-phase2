/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import com.sun.jersey.api.NotFoundException;
import dao.CustomerDAO;
import domain.Customer;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author devpu550
 */
@Path("/customers/{customerID}")
public class CustomerResource {
   
   CustomerDAO customerResourceDAO = new CustomerDAO();
   Integer id ;
   Customer customerB = new Customer();

   public CustomerResource(@PathParam("customerID")Integer id){
    
      if (!customerResourceDAO.exists(id)){
             throw new NotFoundException("There is no customer that matches the ID");
      }      
        customerB = customerResourceDAO.getByID(id);
        this.id = id;
   }
  
   @GET
   public Customer getCustomer(){
      return customerB;
   }
   
   @DELETE
   public void deleteCustomer(){
      customerResourceDAO.delete(customerB);
   }
   
   @PUT
   public Response updateCustomer(Customer updatedCustomer){
      if(this.id.equals(updatedCustomer.getId())){
         customerResourceDAO.updateCustomer(this.id, updatedCustomer);
         return Response.noContent().build();
      }else{
         return Response.status(Response.Status.CONFLICT).build();
      }
     
   }
   
   
}
