package vehicle_rental_system;

public class Truck extends Vehicle {
    private int capacity;

    public Truck(String make, String model, int rentalRate, int capacity) {
        super(make, model, rentalRate);
        setCapacity(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 3200 && capacity < 6000) {
            setRentalRate(3200);
        } else if (capacity >= 6000) {
            setRentalRate(5200);
        } else {
            this.capacity = capacity;
        }
    }

    @Override
    public void calculateRentalCost(int days) {
        System.out.println(getRentalRate() * days);
    }

}
