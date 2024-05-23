public class main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task4();
        task5();
    }

    public static void task1() {
        Book defaultBook = new Book();
        Book parameterizedBook = new Book("Learn Opp", "Cong & Phuc", 200);

        System.out.println("Detail of defaultBook: ");
        defaultBook.displayDetail();
        System.out.println("Detail of parameterizedBook: ");
        parameterizedBook.displayDetail();
    }

    public static void task2() {
        Book book = new Book();

        book.setTitle("Coure Java");
        book.setAuthor("Cong & Phuc");
        book.setPrice(500);

        System.out.println("Detail of book: ");
        System.out.println("Title: " +book.getTitle() + "   Author: "+ book.getAuthor()+ "      Price: "  + book.getPrice());
    }

    public static void task4() {
        Book defaultBook = new Book();
        Book parameterizedBook = new Book("Learn Opp", "Cong & Phuc", 200);
        Book overloadedBook = new Book("Task 4","Cong & Phuc");

        System.out.println("Detail of defaultBook: ");
        defaultBook.displayDetail();
        System.out.println("Detail of parameterizedBook: ");
        parameterizedBook.displayDetail();
        System.out.println("Detail of overloadedBook: ");
        overloadedBook.displayDetail();
    }

    public static void task5() {
        Book defaultBook = new Book();
        Book parameterizedBook = new Book("Learn Opp", "Cong & Phuc", 200);
        Book overloadedBook = new Book("Task 4","Cong & Phuc");

        System.out.println("the total number of books created using the static method: " + Book.getBookCount());
    }


}
