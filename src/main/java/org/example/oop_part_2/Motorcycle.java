package org.example.oop_part_2;
public class Motorcycle extends Vehicle{
    private String engineSize;
    public Motorcycle(String make, String model, String rendalRate, String engineSize)
    {
        super(make, model, rendalRate);
       this.engineSize = engineSize;
    }
    
    public String getEngineSize()
    {
        return engineSize;
    }
    public void setEngineSize(String engineSize)
    {
        if(this.engineSize != null)
        {
            this.engineSize = engineSize;
        }
        else    
        {
            System.out.println("Invalid engine size");
        }
    }
    public void calculateRentalCost(int days)
    {
        System.out.println("The Tental Cost is: " + super.getRentalRate() +"/" + days);
    }
    public String toString()
    {
        return  super.getMake() +" "+  super.getModel()+" " + super.getRentalRate() + " " +engineSize;
    }
}
