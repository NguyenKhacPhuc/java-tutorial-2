package Advanced.Task3;

public class Computer extends Device {
    private String processor;

    public Computer(String brand, String model, String processor) {
        super(brand, model);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + "', " +
                "model='" + getModel() + "', " +
                "processor='" + processor + "'}";
    }
}

