package start.start;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class App 
{
  
    	 public static void main(String[] args) throws Exception {  
    		 Server server = new Server(8080);
    		  
    		  WebAppContext webapp = new WebAppContext();
    		  webapp.setWar("E:/proxy.war");
    		  
    		  server.setHandler(webapp);
    		  
    		  server.start(); 
    	    }  
    
}
