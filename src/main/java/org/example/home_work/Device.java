public class Device {
    private String model;
    private String brand;

    public Device(String model, String brand) {
        this.model = model;
        this.brand = brand;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (this.brand != null) {
            this.brand = brand;
        } else {
            System.out.println("Invalid brand");
        }
    }
}
