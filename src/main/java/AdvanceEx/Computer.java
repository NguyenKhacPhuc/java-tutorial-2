package AdvanceEx;

public class Computer extends Device{
    private String processor;


    public Computer(String brand, String model, String processor) {
        super(brand, model);
        this.processor = processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }
    @Override
    public void displayDetail() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + this.processor);
    }
}
