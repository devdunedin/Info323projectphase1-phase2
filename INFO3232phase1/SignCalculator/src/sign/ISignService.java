/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sign;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author devpu550
 */
@WebService
public interface ISignService {
 
       /**
    *
    * @param dob
    * @param month
    * @param gender
    * @return
    */
   public @WebResult(name = "message") String signCalculator (@WebParam(name = "dob") int dob, 
                            @WebParam(name = "month") String month,
                            @WebParam (name = "gender") String gender);
       
       /**
    *
    * @return
    */
   //public @WebResult(name = "message") String signCalculator();
   
}
