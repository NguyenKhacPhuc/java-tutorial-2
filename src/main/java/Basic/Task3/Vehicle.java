package Basic.Task3;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make != null && make.matches("^[a-zA-Z0-9 ]*$") && make.equals(make.trim())) {
            this.make = make;
        } else {
            System.out.println("Invalid");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && model.matches("^[a-zA-Z0-9 ]*$") && model.equals(model.trim())) {
            this.model = model;
        } else {
            System.out.println("Invalid");
        }
    }

    @Override
    public String toString() {
        return "Basic.Task3.Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
