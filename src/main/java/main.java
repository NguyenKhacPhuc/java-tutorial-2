import animal_sounds.Animal;
import animal_sounds.Cat;
import animal_sounds.Cow;
import animal_sounds.Dog;
import employee_management_system.Employee;
import employee_management_system.HourlyEmployee;
import employee_management_system.SalariedEmployee;
import online_store_payment_system.BankTransfer;
import online_store_payment_system.CreditCard;
import online_store_payment_system.PayPal;
import online_store_payment_system.PaymentMethod;
import shape_area_calculation.Circle;
import shape_area_calculation.Rectangle;
import shape_area_calculation.Shape;
import shape_area_calculation.Triangle;
import vehicle_rental_system.Car;
import vehicle_rental_system.Motorcycle;
import vehicle_rental_system.Truck;
import vehicle_rental_system.Vehicle;

public class main {
    public static void main(String[] args) {
        animalSounds();
        shapeAreaCalculation();
        employeeManagementSystem();
        vehicleRentalSystem();
        onlineStorePaymentSystem();
    }

    public static void animalSounds() {
        Animal pugDog = new Dog();
        Animal tomCat = new Cat();
        Animal dairyCow = new Cow();

        Animal[] sound = new Animal[]{pugDog, tomCat, dairyCow};
        for (Animal s : sound) {
            s.makeSound();
        }
    }

    public static void shapeAreaCalculation() {
        Shape circle = new Circle(4.5f);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(2.4f, 5);

        Shape[] area = new Shape[]{circle, rectangle, triangle};
        for (Shape a : area) {
            a.calculateArea();
        }
    }

    public static void employeeManagementSystem() {
        Employee monthlySalary = new SalariedEmployee("Anh quan", "A2507", 320000);
        Employee hourlyEmployee = new HourlyEmployee("Van A", "A2107", 600, 5);

        Employee[] emp = new Employee[]{monthlySalary, hourlyEmployee};
        for (Employee e : emp) {
            e.calculateSalary();
        }
    }

    public static void vehicleRentalSystem() {
        Vehicle car = new Car("Kia", "Modern", 1200, "Electron");
        Vehicle truck = new Truck("Kia", "Modern", 1200, 5000);
        Vehicle motorcycle = new Motorcycle("Kia", "Modern", 1200, 250);

        Vehicle[] RentalCost = new Vehicle[]{car, truck, motorcycle};
        for (Vehicle rc : RentalCost) {
            rc.calculateRentalCost(2);
        }
    }

    public static void onlineStorePaymentSystem() {
        PaymentMethod creditCard = new CreditCard(1200047993, "12/12/2030", 83600);
        PaymentMethod bankTransfer = new BankTransfer("DAM HUY ANH QUAN", "012345678");
        PaymentMethod payPal = new PayPal("quandha07@gmail.com", "123456");

        PaymentMethod[] processPayment = new PaymentMethod[]{creditCard, bankTransfer, payPal};
        for (PaymentMethod pm : processPayment) {
            pm.processPayment(32000);
        }
    }


}
