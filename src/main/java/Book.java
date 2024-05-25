public class Book {
    private static int bookCount = 0;
    private String title;
    private String author;
    private double price;

    public Book() {
        title = "De men phuu luu ki";
        author = "To Hoai";
        price = 1200;
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
        if(title != null && title.matches("^[a-zA-Z0-9 ]*$") && title.equals(title.trim())){
            this.title = title;
        }else {
            System.out.println("Invalid");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author != null && author.matches("^[a-zA-Z0-9 ]*$") && author.equals(author.trim())){
            this.author = author;
        }else {
            System.out.println("Invalid");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }else {
            System.out.println("Invalid");
        }
    }

    public void displayDetails() {
        System.out.println("Book Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price);
    }

    public double applyDiscount(double percentage) {
        if(percentage > 0 && percentage <= 100){
            return price * (percentage / 100);
        }else {
            return price;
        }
    }
}
