package shape_area_calculation;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * (radius * radius)));
    }
}
