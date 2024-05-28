package Advanced.Task4;

public class Engine {
    private int horsepower;
    private String type;

    // Constructor
    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    // Getter for horsepower
    public int getHorsepower() {
        return horsepower;
    }

    // Setter for horsepower
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }
}

