package domain;

import javax.xml.bind.annotation.*;

/**
 * Created by firzhan on 9/1/14.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"employee"})
@XmlRootElement(name = "jsonObject")
public class JsonObject {

    @XmlElement(required = true)
    protected Employee employee;

    public JsonObject(){}

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

}
