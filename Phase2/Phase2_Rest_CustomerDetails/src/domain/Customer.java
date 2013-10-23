/**
 * @author PDEV
 * @date 10 May 2013
 * 
 */

package domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

   private Integer id;
   private String name;
   private int date;
   private String month;
   private String gender;


   public Customer() {};

   public Customer(Integer id, String name, int date, String month, String gender) {
      this.id = id;
      this.name = name;
      this.date = date;
      this.month = month;
      this.gender = gender;
   }

   

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getDate() {
      return date;
   }

   public void setDate(int date) {
      this.date = date;
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


}
