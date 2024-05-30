package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        } else {
            System.out.println("Cannot add a null book");
        }
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }
}
