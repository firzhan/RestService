package domain;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("users")
public class User {


    @GET
    @Path("all")
    @Produces("application/json")
    public String getUser(){
        return "{'m':'hello'}";
    }

//   @Context HttpServletResponse response /

    @POST
    @Path("allXML")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public Employee getEmployeeXML(JsonObject jsonObject){

        Employee employee = jsonObject.getEmployee();
        System.out.println("Employee name="+employee.getName()+" Age="+employee.getAge());

        employee.setAge(125);
        employee.setName("ServerName");

        return employee;
    }

}
