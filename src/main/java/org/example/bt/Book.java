package bt;

public class Book {
    // start task 1
    private String title;
    private String author;
    private double price;
    private static int bookCount = 0;

    public Book(String title, String author, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
        bookCount++;

    }

    public Book() {
        this.title = "Untitled";
        this.author = "Unauthor";
        this.price = 0;
        bookCount++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }

    // end task 1

    // start task 2

    public String getTitle() {
        return this.title;
    };

    public void setTitle(String title) {
        this.title = title;
    };

    public String getAuthor() {
        return this.author;
    };

    public void setAuthor(String author) {
        this.author = author;
    };

    public Double getPrice() {
        return this.price;
    };

    public void setPrice(Double price) {
        this.price = price;
    };

    public void applyDiscount(double percentage) {
        double discount = this.price - (this.price * (percentage / 100));
        System.out.println("Sau khi giam gia : " + discount);
    }

    // end task 2

    // start task 4
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 20;
        bookCount++;
    }
    // end task 4

    // start task 5
    public static int getBookCount() {
        return bookCount;

    }
    // end task 5

}
