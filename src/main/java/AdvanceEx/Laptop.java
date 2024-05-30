package AdvanceEx;

public class Laptop extends Computer{
    private int batteryLife;


    public Laptop(String brand, String model, String processor, int batteryLife) {
        super(brand, model, processor);
        this.batteryLife = batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void displayDetail() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Processor: " + getProcessor());
        System.out.println("batteryLife: " + this.batteryLife);

    }
}
