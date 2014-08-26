import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;

import java.io.IOException;

/**
 * Created by firzhan on 8/26/14.
 */
public class ServerThread implements Runnable{

    @Override
    public void run() {
        ResourceConfig rc = new PackagesResourceConfig("domain");
        try {
            HttpServer server = GrizzlyServerFactory.createHttpServer("http://localhost:9999", rc);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
