package bt;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_4();
        task_5();
    }

    // start task 1
    public static void task_1() {
        Book myBook1 = new Book();
        myBook1.displayDetails();

        Book myBook2 = new Book("Sach giao khoa toan tap 1", "Bo GD & DT", 22.3);
        myBook2.displayDetails();
    }
    // end task 1

    // start task 2
    public static void task_2() {
        Book myBook3 = new Book("cho toi mot ve ve tuoi tho", "Nguyen nhat anh", 30);

        System.out.println(myBook3.getAuthor());
        System.out.println(myBook3.getTitle());
        System.out.println(myBook3.getPrice());
        myBook3.applyDiscount(20);
    }
    // end task 2

    // start task 4
    public static void task_4() {
        Book book4 = new Book("Romeo and Juliet", "Stephen Hawking");

        book4.displayDetails();
    }
    // end task 4

    // start task 5
    public static void task_5() {
        Book book5 = new Book("I love you", "Annabell");
        Book book6 = new Book("i don't love u", "Annabell", 22.3);
        Book book7 = new Book();
        System.out.println("Current value of book is  " + Book.getBookCount());
    }
    // end task 5
}