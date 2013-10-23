/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author devpu550
 */
@XmlRootElement
public class Customer implements Serializable {
   private int id;

   private String CustomerName;
   private int dob;
   private String month;
   private String gender;

   public Customer() {
   }

   public Customer(int id, String CustomerName, int dob, String month, String gender) {
      this.id = id;
      this.CustomerName = CustomerName;
      this.dob = dob;
      this.month = month;
      this.gender = gender;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   

   public String getCustomerName() {
      return CustomerName;
   }

   public void setCustomerName(String CustomerName) {
      this.CustomerName = CustomerName;
   }

   public int getDob() {
      return dob;
   }

   public void setDob(int dob) {
      this.dob = dob;
   }

   public String getMonth() {
      return month;
   }

   public void setMonth(String month) {
      this.month = month;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   @Override
   public String toString() {
      return "Customer{" + "id=" + id + ", CustomerName=" + CustomerName + ", dob=" + dob + ", month=" + month + ", gender=" + gender + '}';
   }

 
   
}
