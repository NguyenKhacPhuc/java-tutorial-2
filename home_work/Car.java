public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, int horsePower, String type) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(horsePower, type);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (this.make != null) {
            this.make = make;
        } else {
            System.out.println("Invalid make");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (this.model != null) {
            this.model = model;
        } else {
            System.out.println("Invalid model");
        }
    }

    public int getHorsePower() {
        return engine.getHorsePower();
    }

    public void setHorsePower(int horsePower) {
        engine.sethorsePower(horsePower);
    }

    public String getType() {
        return engine.getType();
    }

    public void setType(String type) {
        engine.setType(type);
    }
}
