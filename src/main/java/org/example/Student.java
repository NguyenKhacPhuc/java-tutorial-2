package org.example;

public class Student extends Person{
    public int studentId;

    public Student(String name, int age, int studentId){
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void displayPersonDetail() {
        System.out.println("StudenID: " + this.studentId);
    }
}
