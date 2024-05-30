package AdvanceEx;

public class Device {
    private String brand;
    private String model;


    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void displayDetail() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }
}
