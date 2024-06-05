package org.example.oop_part_2;
public class Truck extends Vehicle {
    private double capacity;

    public Truck(String make, String model, String rendalRate, double capacity) {
        super(make, model, rendalRate);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if (this.capacity != 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Inavalid capacity");
        }
    }
    public void calculateRentalCost(int days)
    {
        System.out.println("The Tental Cost is: " + super.getRentalRate() +"/" + days);
    }
    public String toString()
    {
        return  super.getMake() +" "+  super.getModel()+" " + super.getRentalRate() + " " +capacity;
    }
}
