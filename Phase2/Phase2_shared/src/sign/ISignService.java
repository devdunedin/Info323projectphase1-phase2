/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sign;

import domain.Customer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author devpu550
 */
@WebService
public interface ISignService extends Remote{
 
       /**
    *
    * @param dob
    * @param month
    * @param gender
    * @return
    */
   public @WebResult(name = "signdetails") String signCalculator (@WebParam(name = "customer") 
           Customer customer) throws RemoteException;
       
       /**
    *
    * @return
    */
   //public @WebResult(name = "message") String signCalculator();
   
}
