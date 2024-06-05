package org.example.exercise4;

public class Truck extends Vehicle {

    private double capacity;

    public Truck(String make, String model, double rentalRate, double capacity) {
        super(make, model, rentalRate);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
