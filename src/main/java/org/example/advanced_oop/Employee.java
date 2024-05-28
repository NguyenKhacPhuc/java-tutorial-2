package advanced_oop;

public class Employee extends Person2{

    public int employeeId;
    public Employee(String name, int employeeId) 
    {
          super(name);
          this.employeeId = employeeId;
    }

    public String getDetails()
    {
        return super.getDetails() + ", employee id: "+employeeId;
    }
}
