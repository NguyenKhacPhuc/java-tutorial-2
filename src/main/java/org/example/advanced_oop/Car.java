package advanced_oop;

public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, int horsepower, String type) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(horsepower, type);
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

    public Engine getEngine() {
        return engine;
    }
  
   
}
