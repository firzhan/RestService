package domain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("users")
public class User {

    @GET
    @Path("all")
    @Produces("application/json")
    public String getUser(){
        return "{'m':'hello'}";
    }

}
