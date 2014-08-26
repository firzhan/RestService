

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;

import java.io.IOException;

/**
 * Created by firzhan on 8/26/14.
 * http://localhost:9999/users/all
 */
public class RestServer {

    // Create and fire up an HTTP server

    public static void main(String[] args) throws InterruptedException {

        Thread serverThread = new Thread(new ServerThread());
        serverThread.start();

        while (true){}

    }

}
