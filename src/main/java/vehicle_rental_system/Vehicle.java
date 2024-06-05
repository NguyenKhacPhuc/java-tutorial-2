package vehicle_rental_system;

public abstract class Vehicle {
    private String make;
    private String model;
    private int rentalRate;

    public Vehicle(String make, String model, int rentalRate) {
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

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract void calculateRentalCost(int days);
}
