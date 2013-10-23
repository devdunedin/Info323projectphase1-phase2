package domain;

import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customers")
public class CustomerIDs {

   @XmlElement(name = "id")
   private Collection<Integer> ids;

   public CustomerIDs() {}

   public CustomerIDs(Collection<Integer> ids) {
      this.ids = ids;
   }

   @Override
   public String toString() {
      return "CustomerIDs{" + "ids=" + ids + '}';
   }
   
   
   
}
