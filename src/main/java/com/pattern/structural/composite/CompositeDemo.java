package com.pattern.structural.composite;

import java.util.Arrays;

public class CompositeDemo {

    public static void main(String[] args) {


        Employee developer = new Employee(111,"Prabhu", "Engineering", "Developer");
        Employee developer2 = new Employee(222,"Suman", "Engineering", "Developer");
        Employee developer3 = new Employee(333,"Banani", "Engineering", "Developer");
        Employee developer4 = new Employee(444,"Ravi", "Engineering", "Developer");

        Employee manager1 = new Employee(555,"Shiva", "Engineering", "EngineeringManager");
        manager1.addSubordinate(developer);
        manager1.addSubordinate(developer2);
        Employee manager2 = new Employee(555,"Sapna", "Engineering", "EngineeringManager");
        manager2.addSubordinate(developer3);
        manager2.addSubordinate(developer4);

        Employee headOfEngg = new Employee(555,"Bimla", "Engineering", "HeadOfEngineering");
        headOfEngg.addSubordinate(manager1);
        headOfEngg.addSubordinate(manager2);

        //Create a company directory
        CompanyDirectory directory = new CompanyDirectory(Arrays.asList(headOfEngg));
        directory.getHeads().stream().forEach(employee -> {
            System.out.println(employee);
            employee.listSubordinates();
        });

    }
}
