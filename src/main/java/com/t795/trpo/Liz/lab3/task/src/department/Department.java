package com.t795.trpo.Liz.lab3.task.src.department;

import com.t795.trpo.Liz.lab3.task.src.people.Employee;

public interface Department {
    void hireEmployee(Employee employee);
    void sackEmployee(int index);
}
