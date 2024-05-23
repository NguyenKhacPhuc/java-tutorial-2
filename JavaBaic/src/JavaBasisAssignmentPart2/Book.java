package JavaBasisAssignmentPart2;

public class Book {
    private  String title;
    private  String author;
    private  double price;

    private static int bookCount=0;

    public Book(){
        title = "Learn JV";
        author = "Cong & Phuc";
        price = 100;
        bookCount++;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        price = 20;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage){
        if (percentage < 0 || percentage >100) return;
        this.price = (this.price * percentage) / 100;
    }

    public void displayDetail(){
        System.out.println("Title: " +title + "     Author: "+ author+ "    Price: "  + price);
    }

    public static int getBookCount(){
        return bookCount;
    }

}


