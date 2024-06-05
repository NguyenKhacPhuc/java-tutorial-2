package org.example.oop_part_2;
public abstract class Vehicle {
    private String make;
    private String model;
    private String rendalRate;

    public Vehicle(String make, String model, String rendalRate) {
        this.make = make;
        this.model = model;
        this.rendalRate = rendalRate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (this.make != null) {
            this.make = make;
        } else {
            System.out.println("Invalid make");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (this.model != null) {
            this.model = model;
        } else {
            System.out.println("Invalid model");
        }
    }

    public String getRentalRate() {
        return rendalRate;
    }

    public void setRentalRate(String rentalRate) {
        if (this.rendalRate != null) {
            this.rendalRate = rentalRate;
        } else {
            System.out.println("Invalid rental rate");
        }
    }
    public abstract void calculateRentalCost(int days); 
}
