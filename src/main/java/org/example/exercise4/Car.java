package org.example.exercise4;

public class Car extends Vehicle {
    private String type;

    public Car(String make, String model, double rentalRate, String type) {
        super(make, model, rentalRate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
