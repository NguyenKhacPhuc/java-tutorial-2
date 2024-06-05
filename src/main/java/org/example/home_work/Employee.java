
public class Employee extends Person2 {
    private String employeeId;

    public Employee(String name, String employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (this.employeeId != null) {
            this.employeeId = employeeId;
        } else {
            System.out.println("invalid employee id");
        }
    }

    public String getDetails() {
        return super.getDetails() + " Employee ID: " + employeeId;
    }
}
