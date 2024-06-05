package org.example.exercise3;

public abstract class Employee {
    private String name;
    private String employeeID;

    public Employee(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public abstract double calculateSalary();
}
