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

    public int getHorsepower() {
        return engine.getHorsepower();
    }

    public void setHorsepower(int horsepower) {
        engine.setHorsepower(horsepower);
    }

    public String getEngineType() {
        return engine.getType();
    }

    public void setEngineType(String engineType) {
        engine.setType(engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine.getHorsepower() + "hp " + engine.getType() +
                '}';
    }
}

