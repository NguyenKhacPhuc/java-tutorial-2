import java.util.*;


public  class Circle extends Shape{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        if(this.radius != 0)
        {
            this.radius = radius;
        }
        else{
            System.out.println("Invalid radius");
        }
    }

    public  void calculateArea()
    {
        System.out.println("Circle: " + radius * 2 * 3.14);
    } 

}
