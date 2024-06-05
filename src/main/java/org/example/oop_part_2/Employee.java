package org.example.oop_part_2;

public abstract class Employee {
    public String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (this.employeeId != null) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Invalid employee");
        }
    }
    
    public abstract double calculateSalary();
}
