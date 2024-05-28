package advanced_oop;

public class Main {
    public static void main(String[] args) {
        // ex_2();
        // ex_3();
        // ex_4();
        // ex_5();
        // ex_6();


    }

    public static void ex_2() {
        Address newAddress = new Address("Lang street", "Ha noi", 112);
        System.out.println(newAddress.getStreet() + " " + newAddress.getCity() + " " + newAddress.getZipCode());

    }

    public static void ex_3() {
        Device newDevice = new Device("Dell", " vostro 550");
        System.out.println(newDevice.getBrand() + " " + newDevice.getModel());

        Computer newComputer = new Computer("Dell", "Vostro 550", "chip inel core i3, 10th gen");
        System.out.println(newComputer.getBrand() + " " + newComputer.getModel() + " " + newComputer.getProcessor());

        Laptop newLaptop = new Laptop("Dell", "Vostro 550", "chip inel core i3, 10th gen", 120);
        System.out.println(newLaptop.getBrand() + " " + newLaptop.getModel() + " " + newLaptop.getProcessor() + " "
                + newLaptop.getBatteryLife());
    }

    public static void ex_4() {
        Car newCar = new Car("porsche", "911", 124, "red");
        System.out.println(newCar.getMake() + " " + newCar.getModel() + " " + newCar.getEngine().getHorsepower() + " "
                + newCar.getEngine().getType());
    }
    public static void ex_5(){
        Employee newEmployee = new Employee("john smith",1);
        System.out.println(newEmployee.getDetails());
    }

    public static void ex_6()
    {
        Game footballGame = new Football();
        footballGame.play();

        Game cricketGame = new Cricket();
        cricketGame.play();
    }
}
