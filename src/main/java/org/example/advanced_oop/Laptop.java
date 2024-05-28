package advanced_oop;
public class Laptop extends Computer {
    private int batteryLife;

    public Laptop(String brand, String model, String processor, int batteryLife) {
        super(brand, model, processor);
        this.batteryLife = batteryLife;
    }
    public int getBatteryLife() {
        return batteryLife;
    }
}
