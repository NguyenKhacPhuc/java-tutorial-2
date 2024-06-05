package employee_management_system;

public class HourlyEmployee extends Employee {
    private float hourlyRate;
    private float hoursWorked;

    public HourlyEmployee(String name, String employeeId, float hourlyRate, float hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println(hourlyRate * hoursWorked);
    }

}
