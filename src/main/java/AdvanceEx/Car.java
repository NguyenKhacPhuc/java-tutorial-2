package AdvanceEx;

public class Car{
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getEngineHorsepower() {
        return engine.getHorsepower();
    }

    public void setEngineHorsepower(int horsepower) {
        engine.setHorsepower(horsepower);
    }

    public String getEngineType() {
        return engine.getType();
    }

    public void setEngineType(String type) {
        engine.setType(type);
    }

    public void displayDetail() {
        System.out.println("Nake: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Engine: " + this.engine);
    }
}
