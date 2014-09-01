package domain;

/**
 * Created by firzhan on 9/1/14.
 */
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {"name","age"})
@XmlRootElement(name = "employee")
public class Employee {

    @XmlElement(required = true)
    protected String name;

    @XmlElement(required = true)
    protected int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
