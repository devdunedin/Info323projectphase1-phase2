/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sign;

import javax.jws.WebService;

/**
 *
 * @author devpu550
 */

@ WebService(endpointInterface = "sign.ISignService",
        serviceName = "SignService",
        portName = "SignPort")
public class SignServiceImpl implements ISignService{
 String sunsign; 
   @Override
   public String signCalculator(int dob, String month, String gender) {
      
    
      if (month.equals("august")) {
         if (dob < 22) {
            switch (gender) {
               case "male":
                  sunsign = "leo male";
                  break;
               case "female":
                  sunsign = "leo female";
                  break;
            }
         } else {
            sunsign = "dont know";
         }
      } else {
         sunsign = "dont know";

      }
      return sunsign;
   }


   public String signCalculator() {
      return "everythings empty";
     
   }

 
  
}
