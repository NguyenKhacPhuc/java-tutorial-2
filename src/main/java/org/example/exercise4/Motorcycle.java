package org.example.exercise4;

public class Motorcycle extends Vehicle {
    private double engineSize;

    public Motorcycle(String make, String model, double rentalRate, double engineSize) {
        super(make, model, rentalRate);
        this.engineSize = engineSize;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
