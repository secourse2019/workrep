package com.t795.trpo.Liz.lab3.task.src.department;

import com.t795.trpo.Liz.lab3.task.src.geolocation.Geolocation;
import com.t795.trpo.Liz.lab3.task.src.people.Employee;
import java.util.List;

public class Office implements Department {
    private Geolocation geolocation;
    private List<Employee> employees;

    Office(Geolocation geolocation){
        this.geolocation = geolocation;
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
}
