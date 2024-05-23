public class Main {
    public static void main(String[] args) {
        //Assignment 1
        Book task1 = new Book();
        task1.displayDetails();
        Book task2 = new Book("Truyen Kieu", "Nguyen Du", 3500);
        task2.displayDetails();

        //Assignment 2
        Book task3 = new Book();
        task3.setTitle("Chu nguoi tu tu");
        task3.setAuthor("Ho Chi Minh");
        task3.setPrice(1000);
        System.out.println("Book Title: " + task3.getTitle() + ", Author: " + task3.getAuthor() +
                ", Price: " + task3.getPrice() + ", Discount: " + task3.applyDiscount(50));

        //Assignment 4
        Book task4 = new Book("Hat gao lang ta", "Tran Dang Khoa");
        task4.displayDetails();

        //Assignment 5
        Book.getBookCount();
    }
}