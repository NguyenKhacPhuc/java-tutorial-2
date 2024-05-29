package Basic.Task8;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }

}
