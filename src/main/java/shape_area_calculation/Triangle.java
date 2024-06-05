package shape_area_calculation;

public class Triangle extends Shape {
    private float height;
    private float bottom;

    public Triangle(float height, float bottom) {
        this.height = height;
        this.bottom = bottom;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBottom() {
        return bottom;
    }

    public void setBottom(float bottom) {
        this.bottom = bottom;
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle Area: " + ((height * bottom) / 2));
    }
}
