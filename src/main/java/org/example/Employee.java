package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (healthPlans[index] == null) {
            healthPlans[index] = name;
        } else {
            System.out.println("Index already occupied!");
        }
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', healthPlans=" + Arrays.toString(healthPlans) + "}";
    }
}
