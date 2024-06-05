import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Enter a number of the exercise");
            int start = scanner.nextInt();
            switch (start) {
                case 1:
                    ex_1();
                    break;
                case 2:
                    ex_2();
                    break;
                case 3:
                    ex_3();
                    break;
                case 4:
                    ex_4();
                    break;
                case 5:
                    ex_5();
                    break;

                default:
                    continueLoop = false;
                    break;
            }
        }
    }

    public static void ex_1() {
        Animal newDog = new Dog();
        Animal newCat = new Cat();
        Animal newCow = new Cow();
        Animal[] animals = { newDog, newCat, newCow };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void ex_2() {
        Shape circle = new Circle(12.2);
        Shape rectangle = new Rectangle(12, 4);
        Shape triangle = new Triangle(8, 3);

        Shape[] shapes = { circle, rectangle, triangle };
        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }

    public static void ex_3() {
        Employee monthSalary = new SalariedEmployee("HN001", 223.4);

        Employee hourlyEmployee = new HourlyEmployee("HN002", 223, 20, 40);

        Employee[] employees = { monthSalary, hourlyEmployee };

        for (Employee employee : employees) {

            System.out.println(employee.getEmployeeId() + ", " + employee.calculateSalary());
        }

    }

    public static void ex_4() {
        Vehicle newCar = new Car("Toyota", "Camry", "200$", "sedan");

        Vehicle newTruck = new Truck("Ford", "Ranger", "300$", 1000);

        Vehicle newMotor = new Motorcycle("SH", "mode", "100$", "125CC");

        Vehicle[] vehicles = { newCar, newMotor, newTruck };

        for (Vehicle vehicle : vehicles) {
            vehicle.calculateRentalCost(12);
        }
    }

    public static void ex_5() {
        PaymentMethod newCredit = new CreditCard("12345678", "22/4/2026", 24);
        PaymentMethod newPayPal = new PayPal("12345678dds@gmail.com", "1convitxoera2caicanh");
        PaymentMethod newBankTransfer = new BankTransfer("1224567n2", "987653211");

        PaymentMethod[] payments = { newBankTransfer, newPayPal, newCredit };
        for (PaymentMethod payment : payments) {
            System.out.println(payment);
            payment.processPayment(2000);

        }

    }
}