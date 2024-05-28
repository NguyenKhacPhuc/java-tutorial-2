import bt.Book;

public class Main {
    public static void main(String[] args) {
        // ex_4();
        // ex_5();
        // ex_6();
        // ex_7();
        // ex_8();
        // ex_9();
        ex_10();


    }

    public static void ex_4() {
        Shape newShape = new Shape();
        newShape.draw();

        Circle circle = new Circle(5.5);
        circle.draw();

        Rectangle rectangle = new Rectangle(1.3, 2);
        rectangle.draw();
    }

    public static void ex_5() {
        Student newStudent = new Student("Vinh", 18, 1);
        System.out.println(newStudent);
    }

    public static void ex_6() {
        BankAccount newAccount = new BankAccount(1, 12345);
        newAccount.Deposit(123);
        newAccount.WidthDraw(2345);

        SavingsAccount savingsAccount = new SavingsAccount(1, 456.4, 0.02);
        savingsAccount.Deposit(123);
        savingsAccount.WidthDraw(80);
        System.out.println("The interest rate is: " + savingsAccount.getRate());
    }

    public static void ex_7() {
        Book newBook = new Book("TOi thay hoa vang tren co xanh ", "Nguyen Nhat Anh");
        System.out.println("Title: " + newBook.getTitle() + " Author: " + newBook.getAuthor());

        EBook eBook = new EBook("Cho toi mot ve ve tuoi tho", "Nguyen Nhat ANh", "120 MB");
        System.out.println(
                "Title: " + eBook.getTitle() + " Author: " + eBook.getAuthor() + " Size" + eBook.getFileSize());
    }

    public static void ex_8() {
        Library library = new Library();

        library.addBook("Tham tu lung danh conan", "gosho aoyama");
        library.addBook("Cho toi mot ve ve tuoi tho", "Nguyen Nhat Anh");

        library.listBooks();

        // library.removeBook("Tham tu lung danh conan");
        // library.listBooks();

    }

    public static void ex_9() {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee developer = new Developer();

        employee.work();
        manager.work();
        developer.work();
    }
    public static void ex_10()
    {
        Building newBuilding = new Building("112 lang ha hanoi", "Circle k");
        System.out.println("new building at " + newBuilding.getAddress() + " name is: "+ newBuilding.getNameBuilding());
        
        House newHouse = new House("xom 8 ,nghia tien ,thai hoa ,nghe an", "Nha o dang ong", 2);
        System.out.println("My house: " + newHouse.getAddress() + ", : " + newHouse.getNameBuilding() + ", floor: " + newHouse.getFloor());
    }

}
