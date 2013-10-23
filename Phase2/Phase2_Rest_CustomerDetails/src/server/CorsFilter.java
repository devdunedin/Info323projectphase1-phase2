/**
 * @author PDEV
 * @date 10 May 2013
 * 
 */

package server;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

public class CorsFilter implements ContainerResponseFilter {

   @Override
   public ContainerResponse filter(ContainerRequest request, ContainerResponse response) {

      // get the requested origin, method and headers
      String requestedOrigin = request.getHeaderValue("Origin");
      String requestedMethod = request.getHeaderValue("Access-Control-Request-Method");
      String requestedHeaders = request.getHeaderValue("Access-Control-Request-Headers");

      // allow the requested method, headers, and origin
      MultivaluedMap<String, Object> headers = response.getHttpHeaders();
      headers.add("Access-Control-Allow-Origin", requestedOrigin);
      headers.add("Access-Control-Allow-Methods", requestedMethod);
      headers.add("Access-Control-Allow-Headers", requestedHeaders);

      return response;
   }

}
