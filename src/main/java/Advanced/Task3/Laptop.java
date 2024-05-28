package Advanced.Task3;

public class Laptop extends Computer {
    private int batteryLife;

    // Constructor
    public Laptop(String brand, String model, String processor, int batteryLife) {
        super(brand, model, processor); // Call the constructor of the Computer class
        this.batteryLife = batteryLife;
    }

    // Getter for batteryLife
    public int getBatteryLife() {
        return batteryLife;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + getBrand() + "', " +
                "model='" + getModel() + "', " +
                "processor='" + getProcessor() + "', " +
                "batteryLife=" + batteryLife + " hours}";
    }

    // Main method for testing
}

