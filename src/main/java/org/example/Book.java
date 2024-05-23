package org.example;

public class Book {
    private String title;
    private String author;
    private double price = 20.0;
    static int bookCount;

    public Book() {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(String a, String b, double h) {
        bookCount++;
        title = a;
        author = b;
    }

    void displayDetail() {
        System.out.println(title + " " + author + " " + price);
    }

    public void setInf(String newtitle, String newauthor, double newprice) {
        this.title = newtitle;
        this.author = newauthor;
        this.price = newprice;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public double getprice() {
        return price;
    }

    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
        System.out.println("Gia da giam" + price);
    }

    Book(String t, String a) {
        bookCount++;
        title = t;
        author = a;
    }

    public static int getBookCount() {
        return bookCount;
    }
}
