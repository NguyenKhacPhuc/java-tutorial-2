public class Engine {
    private int horsePower;
    private String type;

    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void sethorsePower(int horsePower) {
        if (this.horsePower != 0) {
            this.horsePower = horsePower;
        } else {
            System.out.println("Invalid horsepower");
        }
    }

    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        if(this.type != null)
        {
            this.type = type;
        }
        else{
            System.out.println("Invalid type: " + type);
        }
    }

}
