package AdvanceEx;

public class Engine {
    private int horsepower;
    private String type;

    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getType() {
        return type;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayDetail() {
        System.out.println("Horsepower: " + this.horsepower);
        System.out.println("Type: " + this.type);
    }
}
