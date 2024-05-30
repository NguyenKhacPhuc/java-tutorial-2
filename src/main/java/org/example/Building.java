package org.example;

public class Building {
    private int floor;
    private int apartment;

    public Building(){}

    public Building(int floor, int apartment) {
        this.floor = floor;
        this.apartment = apartment;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void displayDetail() {
        System.out.println("Number of partment : " + this.apartment);
        System.out.println("Number of partment : " + this.floor);
    }
}
