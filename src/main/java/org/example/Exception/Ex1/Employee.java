package org.example.Exception.Ex1;

public abstract class Employee {
    private double yearOfExperiences;
    private String name;
    private String gender;

    public Employee(double yearOfExperiences, String name, String gender) {
        this.yearOfExperiences = yearOfExperiences;
        this.gender = gender;
        this.name = name;
    }

    public double getYearOfExperiences() {
        return yearOfExperiences;
    }

    public void setYearOfExperiences(double yearOfExperiences) {
        if (this.yearOfExperiences != 0) {
            this.yearOfExperiences = yearOfExperiences;
        } else {
            System.out.println("Invalid year of experience");
        }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (this.gender == "male" || this.gender == "Male") {
            this.gender = "Male";
        } else if (this.gender == "female" || this.gender == "Female") {
            this.gender = "Female";
        }

        System.out.println("Invalid gender");
    }

    public abstract void joinDailyMeeting();

    public abstract void takeARest();

    public abstract void goHome();

}
