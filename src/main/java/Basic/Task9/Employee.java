package Basic.Task9;

public class Employee {
    private String name;
    private int age;
    private String programmingLanguage;

    public Employee(String name, int age, String programmingLanguage) {
        this.name = name;
        this.age = age;
        this.programmingLanguage = programmingLanguage;
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
        }
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage != null && programmingLanguage.matches("^[a-zA-Z0-9 ]*$") && programmingLanguage.equals(programmingLanguage.trim())) {
            this.programmingLanguage = programmingLanguage;
        } else {
            System.out.println("Invalid");
        }
    }

    public String work() {
        return "Name: " + name + ", age: " + age + ", programming language: " + programmingLanguage;
    }
}
