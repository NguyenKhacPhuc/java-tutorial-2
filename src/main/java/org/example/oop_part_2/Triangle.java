public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (this.base != 0) {
            this.base = base;
        } else {
            System.out.println("Invalid base");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (this.height != 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height");
        }
    }
    public void calculateArea()
    {
          System.out.println("Triangle is: " +    (base * height) / 2);
    }
}
