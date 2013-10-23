/**
 * @author PDEV
 * @date 10 May 2013
 * 
 */
package dao;

import domain.Customer;
import domain.CustomerIDs;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerDAO {

   private final static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

   // create some sample customers for testing purposes
   static {
      if (customers.isEmpty()) {
         customers.put(1357, new Customer(1357, "Robinson Crusoe",16,"august", "male"));
         customers.put(2468, new Customer(2468, "Joan of Arc", 12,"august","female"));
      }
   }

   public Collection<Customer> getAll() {
      return customers.values();
   }

   public CustomerIDs getIDs() {
      return new CustomerIDs(customers.keySet());
   }
   
   public Customer getByID(Integer id) {
      return customers.get(new Integer(id));
   }

   public Boolean exists(Integer id) {
      return customers.containsKey(id);
   }
   
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
