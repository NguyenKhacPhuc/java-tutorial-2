package vehicle_rental_system;

public class Car extends Vehicle {
    private String type;

    public Car(String make, String model, int rentalRate, String type) {
        super(make, model, rentalRate);
        setType(type);
    }

    public String getType() {
        return "sedan, SUV";
    }

    public void setType(String type) {
        if (type == "sedan") {
            setRentalRate(3200);
        } else if (type == "SUV") {
            setRentalRate(4200);
        } else {
            this.type = type;
        }
    }

    @Override
    public void calculateRentalCost(int days) {
        System.out.println(getRentalRate() * days);
    }
}
