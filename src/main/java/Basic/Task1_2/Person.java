package Basic.Task1_2;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z0-9 ]*$") && name.equals(name.trim())) {
            this.name = name;
        } else {
            System.out.println("Invalid");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\\\.[A-Za-z]{2,}$") && email.equals(email.trim())) {
            this.email = email;
        } else {
            System.out.println("Invalid");
        }
    }

    public void personDetail() {
        System.out.println("name: " + this.name + ", age: " + this.age + ", email: " + this.email);
    }

    @Override
    public String toString() {
        return "Advanced.Task1.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
