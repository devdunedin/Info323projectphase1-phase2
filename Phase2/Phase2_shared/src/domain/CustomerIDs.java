/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author devpu550
 */
 @XmlRootElement(name = "customers")

public class CustomerIDs {
  
   
    @XmlElement(name = "id")
   private Collection<Integer> ids;

   public CustomerIDs() {}

   public CustomerIDs(Collection<Integer> ids) {
      this.ids = ids;
   }

   public Collection<Integer> getIds() {
      return ids;
   }

   public void setIds(Collection<Integer> ids) {
      this.ids = ids;
   }
   
}
