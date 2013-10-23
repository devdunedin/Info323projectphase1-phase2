/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Customer;
import domain.CustomerIDs;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author devpu550
 */
public class CustomerDAO {
  

   //collection to hold our products 
   private final static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

   /* create some dummy products for testing purposes
    * 
    * now the below code is not a method or a constructor, 
    * but it works like a constructor; the difference is constructor is 
    * associated with a particular dao, but below code applies to any instance, 
    * meaning that any time we create an instance of this class, the below code
    * will automatically will run, entering the data into the memory (dao) 
    * collection. 
    * 
    */
   static {
      if (customers.isEmpty()) {
         customers.put(1234, new Customer(1234,"Barack Obama",14,"August","male"));
         customers.put(2345, new Customer(2345,"Julia Roberts",15,"August","female"));
      }
   }

   /**
    * get all the customer values. 
    * @return 
    */
   public Collection<Customer> getAll() {
      return customers.values();
   }

   /**
    * return all the customer's ids. 
    * @return 
    */
   public CustomerIDs getIDs() {
      return new CustomerIDs(customers.keySet());
   }

   /**
    * get an customer by its id. 
    * @param id
    * @return 
    */
   public Customer getByID(Integer id) {
      return customers.get(new Integer(id));
   }

   /**
    * return a boolean true or false if a particular id exists in customers. 
    * @param id
    * @return 
    */
   public Boolean exists(Integer id) {
      return customers.containsKey(id);
   }

   /**
    * create a new Customer 
    * @param product 
    */
   public void create(Customer customer) {
      customers.put(customer.getId(), customer);
   }

   public void delete(Customer customer) {
      customers.remove(customer.getId());
   }

   public void updateCustomer(Integer id, Customer customer) {
      customers.put(id, customer);
   }
   
} 

