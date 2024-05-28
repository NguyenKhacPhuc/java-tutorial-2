public class House extends Building {
    private int floor;
    
    public House(String address, String nameBuilding, int floor) {
        super(address, nameBuilding);
        this.floor = floor;
    }

    public int getFloor()
    {
        return floor;
    }
    public void setFloor(int floor)
    {
        this.floor = floor;
        
    }
}
