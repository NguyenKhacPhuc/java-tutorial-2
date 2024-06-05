import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("enter a number");
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
                // case 6:
                //      ex_6();
                //      break;
                    
                case 7:
                    ex_7(); 
                    break;
                default:
                    System.out.println("Vui lòng nhập số hợp lệ.");
                    continueLoop = false; 
            }
        }
    }
    public static void ex_1()
    {
          Person person = new Person("John week", 23);
          System.out.println("Person: " + person.getName() + " ,age: "+person.getAge());

          Person copyPerson = new Person(person);
          copyPerson.setName("Vinh");
          copyPerson.setAge(23);
          System.out.println("Original person: " + person.getName() + ", " + person.getAge());
        System.out.println("Copied person: " + copyPerson.getName() + ", " + copyPerson.getAge());

    }
    public static void ex_2() {
        Address myAddress = new Address("123 Lang street", "hanoi", "HN10001");
        System.out.println("Street: " + myAddress.getStreet());
        System.out.println("City: " + myAddress.getCity());
        System.out.println("Zipcode: " + myAddress.getZipCode());
    }

    public static void ex_3()

    {
        Laptop myLaptop = new Laptop("Dell", "vostro 550", "Intel Core i3", 10);
        System.out.println("Brand: " + myLaptop.getBrand());
        System.out.println("Model: " + myLaptop.getModel());
        System.out.println("Processor: " + myLaptop.getProcessor());
        System.out.println("Battery Life: " + myLaptop.getBatteryLife() + " hours");
    }

    public static void ex_4() {
        Car myCar = new Car("Toyota", "Camry", 200, "Gasoline");
        System.out.println("My car: " + myCar.getMake() + " " + myCar.getModel());
        System.out.println("Engine type: " + myCar.getType());
        System.out.println("Horsepower: " + myCar.getHorsePower());
    }

    public static void ex_5() {
        Person2 person = new Person2("John");
        Employee employee = new Employee("John week", "E122");

        System.out.println(person.getDetails());
        System.out.println(employee.getDetails());
    }
    public static void ex_7()
    {
        Game fooball = new Football();
        fooball.play();

        Game cricket = new Cricket();
        cricket.play();

    }
    // public static void ex_6()
    // {
    //     Library library = new Library();
    //     library.addBook("Cho toi mot ve ve tuoi tho");

    // }

}
