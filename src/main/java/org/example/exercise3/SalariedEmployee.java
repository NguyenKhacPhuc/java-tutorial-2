package org.example.exercise3;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String employeeID, double monthlySalary) {
        super(name, employeeID);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
