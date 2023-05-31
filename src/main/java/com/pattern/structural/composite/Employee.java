package com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int empId;
    private String name;
    private String dept;
    private String role;

    private List<Employee> subordinates;

    public Employee(int empId, String name, String dept, String role) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.role = role;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinates(Employee employee) {
        subordinates.remove(employee);
    }

    public void listSubordinates() {
        int sub = subordinates.size();
        if (sub != 0) {
            subordinates.forEach(employee -> {
                System.out.println(employee);
                employee.listSubordinates();
            });
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
