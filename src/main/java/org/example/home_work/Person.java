public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person otherPerson)
    {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name != null) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age != 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }

    }

}
