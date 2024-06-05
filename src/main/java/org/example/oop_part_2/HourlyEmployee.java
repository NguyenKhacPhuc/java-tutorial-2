public class HourlyEmployee extends SalariedEmployee {
    private double hourlyEmployee;
    private double hourWorked;

    public HourlyEmployee(String employeeId, double monthSalary, double hourlyEmployee, double hourWorked) {
        super(employeeId, monthSalary);
        this.hourWorked = hourWorked;
        this.hourlyEmployee = hourlyEmployee;
    }

    public double getHourlyEmployee() {
        return hourlyEmployee;
    }

    public void setHourlyEmployee(double hourlyEmployee) {
        if (this.hourlyEmployee != 0) {
            this.hourlyEmployee = hourlyEmployee;
        } else {
            System.out.println("invalid hourlyEmployee");
        }
    }   

    public double getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(double hourWorked) {
        if (this.hourWorked != 0) {
            this.hourWorked = hourWorked;
        } else {
            System.out.println("Invalid hourWorked");
        }
    }
    public double calculateSalary()
    {
           return hourWorked * hourlyEmployee;
    }
}
