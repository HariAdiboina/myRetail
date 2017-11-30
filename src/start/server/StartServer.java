package start.server;

import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.plugins.server.sun.http.SunHttpJaxrsServer;

import com.myretail.app.service.ProductService;

public class StartServer {

	private static final int PORT = 8084;
	public static boolean verbose = false;
	
	public static void main(String[] args) {
		SunHttpJaxrsServer server = new SunHttpJaxrsServer();
		server.setPort(PORT);
		server.getDeployment().setActualResourceClasses(registerResourceClasses());
		server.start();
		System.out.println("Server started & ready to listen for HTTP requests");
	}
	
	/**
	 * Set all the service classes here.
	 * 
	 * @return
	 */
	private static List<Class> registerResourceClasses(){
		List<Class> resourceClasses = new ArrayList<Class>();
		resourceClasses.add(ProductService.class);
		return resourceClasses;
	}
}
