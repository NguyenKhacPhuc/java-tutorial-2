package Advanced;

import Advanced.Task1.Person;
import Advanced.Task2.Address;
import Advanced.Task3.Laptop;
import Advanced.Task4.Car;
import Advanced.Task6.Library;

public class main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task6();

    }

    public static void task1() {
        Person original = new Person("John Doe", 30);
        Person copy = new Person(original);

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);

        copy.setName("Jane Doe");

        System.out.println("After modifying the copy:");
        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
    }
    public static void task2() {
        Address address = new Address("123 Main St", "Springfield", "12345");
        System.out.println(address);
    }
    public static void task3() {
        Laptop laptop = new Laptop("Dell", "XPS 13", "Intel i7", 10);
        System.out.println(laptop);
    }
    public static void task4() {
        Car car = new Car("Toyota", "Camry", 200, "V6");
        System.out.println(car);

        // Modifying engine properties indirectly
        car.setHorsepower(250);
        car.setEngineType("V8");

        // Printing updated car details
        System.out.println("Updated Car Details:");
        System.out.println(car);
    }
    public static void task6() {
        Library library = new Library();

        // Adding books
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        // Listing books
        library.listBooks();

        // Trying to remove a book
        library.removeBook("Book 2");

        // Listing books after removal
        library.listBooks();
    }
}
