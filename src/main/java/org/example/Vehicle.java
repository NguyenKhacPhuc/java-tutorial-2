package org.example;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle() {}

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void displayVehicleDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

