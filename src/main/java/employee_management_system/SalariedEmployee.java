package employee_management_system;

public class SalariedEmployee extends Employee {
    private float monthlySalary;

    public SalariedEmployee(String name, String employeeId, float monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void calculateSalary() {
        System.out.println(monthlySalary);
    }

}
