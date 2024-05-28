package Basic.Task7;

public class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && title.matches("^[a-zA-Z0-9 ]*$") && title.equals(title.trim())) {
            this.title = title;
        } else {
            System.out.println("Invalid");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && author.matches("^[a-zA-Z0-9 ]*$") && author.equals(author.trim())) {
            this.author = author;
        } else {
            System.out.println("Invalid");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
