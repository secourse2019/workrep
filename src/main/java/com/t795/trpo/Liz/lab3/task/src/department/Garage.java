package com.t795.trpo.Liz.lab3.task.src.department;

import com.t795.trpo.Liz.lab3.task.src.geolocation.Geolocation;
import com.t795.trpo.Liz.lab3.task.src.people.Employee;
import com.t795.trpo.Liz.lab3.task.src.transport.GroundTransport;
import java.util.List;

public class Garage implements Department{
    private Geolocation geolocation;
    private List<GroundTransport> groundTransports;
    private List<Employee> employees;

    Garage(Geolocation geolocation, List<GroundTransport> groundTransports) {
        this.geolocation = geolocation;
        this.groundTransports = groundTransports;
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sackEmployee(int index) {
        employees.remove(index);
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public List<GroundTransport> getGroundTransports() {
        return groundTransports;
    }

    public void setGroundTransports(List<GroundTransport> groundTransports) {
        this.groundTransports = groundTransports;
    }
}
