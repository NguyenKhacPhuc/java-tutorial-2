package Basic.Task10;

public class House extends Building {
    private int numberOfFloor;
    private String style;
    private String colorOfPaint;

    public House(String material, int numberOfFloor, String style, String colorOfPaint) {
        super(material);
        this.numberOfFloor = numberOfFloor;
        this.style = style;
        this.colorOfPaint = colorOfPaint;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        if (numberOfFloor > 0) {
            this.numberOfFloor = numberOfFloor;
        }
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        if (style != null && style.matches("^[a-zA-Z0-9 ]*$") && style.equals(style.trim())) {
            this.style = style;
        } else {
            System.out.println("Invalid");
        }
    }

    public String getColorOfPaint() {
        return colorOfPaint;
    }


    public void setColorOfPaint(String colorOfPaint) {
        if (colorOfPaint != null && colorOfPaint.matches("^[a-zA-Z0-9 ]*$") && colorOfPaint.equals(colorOfPaint.trim())) {
            this.colorOfPaint = colorOfPaint;
        } else {
            System.out.println("Invalid");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", House{" +
                "numberOfFloor=" + numberOfFloor +
                ", style='" + style + '\'' +
                ", colorOfPaint='" + colorOfPaint + '\'' +
                '}';
    }
}
