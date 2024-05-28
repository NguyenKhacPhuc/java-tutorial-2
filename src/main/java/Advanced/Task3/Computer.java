package Advanced.Task3;

public class Computer extends Device {
    private String processor;

    // Constructor
    public Computer(String brand, String model, String processor) {
        super(brand, model); // Call the constructor of the Device class
        this.processor = processor;
    }

    // Getter for processor
    public String getProcessor() {
        return processor;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + "', " +
                "model='" + getModel() + "', " +
                "processor='" + processor + "'}";
    }
}

