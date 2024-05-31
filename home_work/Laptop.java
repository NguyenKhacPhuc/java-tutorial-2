public class Laptop extends Computer{
      private int batteryLife;

      public Laptop(String brand, String model, String processor, int batteryLife) {
        super(brand, model, processor);
        this.batteryLife = batteryLife;
      }
      public int getBatteryLife() {return batteryLife;}
      public void setBatteryLife(int batteryLife) {
        if(this.batteryLife != 0)
        {
            this.batteryLife = batteryLife;
        }
        else
        {
            System.out.println("Invalid battery life");
        }
    }
}
