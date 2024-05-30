package org.example;

public class House extends Building{
    private int livingRoom;
    private int kitchen;

    public House(){}

    public House(int livingRoom, int kitchen) {
        this.livingRoom = livingRoom;
        kitchen = kitchen;
    }

    public House(int floor, int apartment, int livingRoom, int kitchen) {
        super(floor, apartment);
        this.livingRoom = livingRoom;
        kitchen = kitchen;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        kitchen = kitchen;
    }


    public void displayDetail() {
        System.out.println("Number of livingRoom : " + this.livingRoom);
        System.out.println("Number of Kitchen : " + this.kitchen);
    }
}
