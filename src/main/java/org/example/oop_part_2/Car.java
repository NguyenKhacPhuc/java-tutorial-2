public class Car extends Vehicle {
    private String type;

    public Car(String make, String model, String rendalRate, String type) {
        super(make, model, rendalRate);
        this.type = type;
    }

    public String type() {
        return type;
    }

    public void setType(String type) {
        if (this.type != null) {
            this.type = type;
        } else {
            System.out.println("Invalid type");
        }
    }
    public void calculateRentalCost(int days)
    {
        System.out.println("The Tental Cost is: " + super.getRentalRate() +"/" + days);
    }
    public String toString()
    {
        return  super.getMake() +" "+  super.getModel()+" " + super.getRentalRate() + " " +type;
    }
}
