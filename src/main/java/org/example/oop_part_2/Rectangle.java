import java.util.*;
public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {return width;}
    public void setWidth(){
        if(this.width != 0)
        {
            this.width = 0;
        }
        else {
            System.out.println("Invalid width");
        }
    };

    public double getHeight() {return height;}
    public void setHeight(){
        if(this.height != 0)
        {
            this.height = 0;
        }
        else {
            System.out.println("Invalid height");
        }
    }
    public void calculateArea()
    {
        System.out.println("Rectangle is : " + (width+height) * 2);
    }

}
