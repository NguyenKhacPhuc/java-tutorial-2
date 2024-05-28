package Basic.Task3;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors > 0) {
            this.numberOfDoors = numberOfDoors;
        } else {
            System.out.println("Invalid");
        }
    }

    @Override
    public String toString() {

        return super.toString() + " numberOfDoors" + numberOfDoors;
    }
}
