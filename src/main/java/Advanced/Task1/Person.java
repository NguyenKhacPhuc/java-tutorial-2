package Advanced.Task1;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor for deep copy
    public Person(Person other) {
        this.name = new String(other.name); // Deep copy for the name field
        this.age = other.age; // Primitive types like int are copied directly
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
