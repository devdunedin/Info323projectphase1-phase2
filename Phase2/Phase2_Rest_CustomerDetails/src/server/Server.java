/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.ClasspathResourceConfig;
import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.util.List;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 *
 * @author devpu550
 */
public class Server {
   
   public static void main(String[]args) throws IOException{
      
      //set up logging
      SLF4JBridgeHandler.removeHandlersForRootLogger();
      SLF4JBridgeHandler.install();
      
      
      DefaultResourceConfig rc = new ClasspathResourceConfig();
      List responseFilters = rc. getContainerResponseFilters();
      responseFilters.add(new CorsFilter());
      
      
      //create server
      HttpServer server = HttpServerFactory.create("http://localhost:8081/", rc);
      
      //start server
      server.start();
      
      System.out.println("Service Ready");
      
   }
   
}
