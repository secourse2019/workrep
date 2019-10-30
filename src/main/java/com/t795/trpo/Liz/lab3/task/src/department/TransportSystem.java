package com.t795.trpo.Liz.lab3.task.src.department;

import java.util.List;

public class TransportSystem {
    private List<Department> departments;

    TransportSystem(List <Department> departments){
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
