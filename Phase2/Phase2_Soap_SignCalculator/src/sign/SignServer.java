/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sign;

import javax.xml.ws.Endpoint;

/**
 *
 * @author devpu550
 */
public class SignServer {
    public static  void  main(String[]args){
      System.out.println("Starting Sign Service ...");
      Endpoint.publish("http://localhost:9001/sign", new SignServiceImpl());
      System.out.println("... Ready");
   }
}
