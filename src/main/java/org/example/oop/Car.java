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
        this.numberOfDoors = numberOfDoors;
    }

    public class Main {
        public static void main(String[] args) {
            Car myCar = new Car("Toyota", "Camry", 4);
            System.out.println(myCar.getMake());
            System.out.println(myCar.getModel());
            System.out.println(myCar.getNumberOfDoors());
        }
    }
}
