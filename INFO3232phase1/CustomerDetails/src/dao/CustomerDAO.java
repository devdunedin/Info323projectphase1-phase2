package dao;

import domain.Customer;
import domain.CustomerIDs;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerDAO {

   private final static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

   // create some dummy products for testing purposes
   static {
      if (customers.isEmpty()) {
         customers.put(1234, new Customer(1234, "Freckled Flange",11,"august", "female"));
         customers.put(4321, new Customer(4321, "Fuzzy Widget", 12,"august","male"));
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
