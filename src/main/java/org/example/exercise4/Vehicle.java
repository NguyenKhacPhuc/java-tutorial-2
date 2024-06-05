package org.example.exercise4;

public abstract class Vehicle {
    private String make;
    private String model;
    private double rentalRate;

    public Vehicle(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
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

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}
