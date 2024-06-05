import java.util.*;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    private void addBook(String title) {
        books.add(title);
        System.out.println("Add book " + title);
    }

    protected void removeBook(String title) {
        books.remove(title);
        System.out.println("Remove book " + title);
    }
     
    protected boolean findBook(String title)
    { 
       return books.contains(title); 
    }

    public void addBook()
    {
            System.out.println("Books in the library: ");
            for(String book : books)
            {
                   System.out.println("-" + book);
            }
    }

}
