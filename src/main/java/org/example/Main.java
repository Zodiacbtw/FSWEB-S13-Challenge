package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runTest();
    }

    public static void runTest() {
        Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        String[] healthPlansArray = new String[2];
        healthPlansArray[0] = healthplan.getName();
        Employee employee = new Employee(1, "John Doe", "jd@test.com", "1234", healthPlansArray);

        String[] employees = new String[2];
        employees[0] = employee.getFullName();
        Company company = new Company(1, "Workintech", 1000, employees);

        System.out.println(healthplan);
        System.out.println(employee);
        System.out.println(company);

        employee.addHealthPlan(1, "Premium Health Plan");
        employee.addHealthPlan(1, "Extra Health Plan");
        employee.addHealthPlan(5, "Invalid");

        company.addEmployee(1, "Jane Doe");
        company.addEmployee(1, "New Developer");
        company.addEmployee(-1, "Invalid");

        System.out.println(employee);
        System.out.println(company);
    }
}
