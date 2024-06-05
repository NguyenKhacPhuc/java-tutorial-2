
public class SalariedEmployee extends Employee{

    private double monthSalary;
    
    public SalariedEmployee (String employeeId, double monthSalary)
    {   
        super(employeeId);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary()
    {
        return monthSalary;
    }
    public void setMonthSalary(double monthSalary)
    {
        if(this.monthSalary != 0)
        {
            this.monthSalary = monthSalary;
        }
        else{
            System.out.println("Invalid monthSalary");
        }
    }
    
    public double calculateSalary()
    {
           return monthSalary;
    }
}
