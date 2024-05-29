package Advanced.Task3;

public class Laptop extends Computer {
    private int batteryLife;

    public Laptop(String brand, String model, String processor, int batteryLife) {
        super(brand, model, processor);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + getBrand() + "', " +
                "model='" + getModel() + "', " +
                "processor='" + getProcessor() + "', " +
                "batteryLife=" + batteryLife + " hours}";
    }
}

