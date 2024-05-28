public class Building {
    private String address;
    private String nameBuilding;
    public Building(String address, String nameBuilding)
    {
        this.address = address;
        this.nameBuilding = nameBuilding;
    }
    public Building()
    {
        this.address = "123, trung kinh , trung hoa, ha noi";
        this.nameBuilding = "Nha van hoa phuong";
    }
    public Building(String address)
    {
        this.address = address;
        this.nameBuilding = "Land mark 100";
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getNameBuilding()
    {
        return nameBuilding;
    }
    public void setNameBuilding(String nameBuilding)
    {
        this.nameBuilding = nameBuilding;
    }

}
