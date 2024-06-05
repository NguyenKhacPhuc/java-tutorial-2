package vehicle_rental_system;

public class Motorcycle extends Vehicle {
    private int engineSize;

    public Motorcycle(String make, String model, int rentalRate, int engineSize) {
        super(make, model, rentalRate);
        setEngineSize(engineSize);
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        if (engineSize > 50 && engineSize <= 200) {
            setRentalRate(8000);
        } else if (engineSize > 200 && engineSize <= 250) {
            setRentalRate(12200);
        } else {
            this.engineSize = engineSize;
        }
    }

    @Override
    public void calculateRentalCost(int days) {
        System.out.println(getRentalRate() * days);
    }
}
