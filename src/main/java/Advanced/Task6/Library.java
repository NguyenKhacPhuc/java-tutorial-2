package Advanced.Task6;

public class Library {
    private String[] books;

    public Library() {
        this.books = new String[10]; // Assuming maximum of 10 books
    }

    // Private method to add a book
    public void addBook(String book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added: " + book);
                return;
            }
        }
        System.out.println("Library is full. Cannot add more books.");
    }

    // Private method to remove a book
    public void removeBook(String book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(book)) {
                books[i] = null;
                System.out.println("Book removed: " + book);
                return;
            }
        }
        System.out.println("Book not found: " + book);
    }

    // Protected method to find a book
    protected boolean findBook(String book) {
        for (String b : books) {
            if (b != null && b.equals(book)) {
                return true;
            }
        }
        return false;
    }

    // Public method to list all books
    public void listBooks() {
        System.out.println("Books in the library:");
        for (String book : books) {
            if (book != null) {
                System.out.println("- " + book);
            }
        }
    }
}

