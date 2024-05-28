package Advanced.Task3;

public class Device {
    private String brand;
    private String model;

    // Constructor
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters for brand and model
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Device{brand='" + brand + "', model='" + model + "'}";
    }
}
