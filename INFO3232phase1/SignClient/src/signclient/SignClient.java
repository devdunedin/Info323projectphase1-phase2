/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package signclient;

import sign.ISignService;
import sign.SignService;

/**
 *
 * @author devpu550
 */
public class SignClient {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      SignService service =new SignService();
      final ISignService signCalculatorService = service.getSignPort();
      
      String getSign = signCalculatorService.signCalculator(11, "august", "male");
      System.out.println(getSign);
      
   }
}
