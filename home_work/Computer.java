public class Computer extends Device {

    private String processor;

    public Computer(String brand, String model, String processor) {
        super(brand, model);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        if (this.processor != null) {
            this.processor = processor;
        } else {
            System.out.println("Invalid processor");
        }
    }

}
