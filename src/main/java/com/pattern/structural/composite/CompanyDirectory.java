package com.pattern.structural.composite;

import java.util.List;

public class CompanyDirectory {

    private List<Employee> heads;

    //This Contains all the heads of each department
    public CompanyDirectory(List<Employee> heads) {
        this.heads = heads;
    }

    @Override
    public String toString() {
        return "CompanyDirectory{" +
                "employees=" + heads +
                '}';
    }

    public List<Employee> getHeads() {
        return heads;
    }
}
