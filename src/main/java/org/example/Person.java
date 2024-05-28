package org.example;

public class Person {

    private String name;
    private int age;
    private String email;

    public Person(){}

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) return;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("the email must contains an @ character");
            return;
        }
    }

    public void displayPersonDetail() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

