public class Book {
    private static int bookCount = 0;
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "De men phuu luu ki";
        this.author = "To Hoai";
        this.price = 1200;
        bookCount++;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 20;
        bookCount++;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    public static void getBookCount() {
        System.out.println(bookCount);
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

    public void displayDetails() {
        System.out.println("Book Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price);
    }

    public double applyDiscount(double percentage) {
        return price * (percentage / 100);
    }
}
