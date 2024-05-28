package Advanced.Task4;

public class Car {
    private String make;
    private String model;
    private Engine engine; // Composition: Car has an Engine

    // Constructor
    public Car(String make, String model, int horsepower, String engineType) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(horsepower, engineType);
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for horsepower (indirectly accessing Engine's horsepower)
    public int getHorsepower() {
        return engine.getHorsepower();
    }

    // Setter for horsepower (indirectly modifying Engine's horsepower)
    public void setHorsepower(int horsepower) {
        engine.setHorsepower(horsepower);
    }

    // Getter for engine type (indirectly accessing Engine's type)
    public String getEngineType() {
        return engine.getType();
    }

    // Setter for engine type (indirectly modifying Engine's type)
    public void setEngineType(String engineType) {
        engine.setType(engineType);
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine.getHorsepower() + "hp " + engine.getType() +
                '}';
    }
}

