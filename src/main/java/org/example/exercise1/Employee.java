package org.example.exercise1;

public abstract class Employee {
    private int yearOfExperiences;
    private String name;
    private String gender;

    public Employee(int yearOfExperiences, String name, String gender) {
        this.yearOfExperiences = yearOfExperiences;
        this.name = name;
        this.gender = gender;
    }

    public int getYearOfExperiences() {
        return yearOfExperiences;
    }

    public void setYearOfExperiences(int yearOfExperiences) {
        this.yearOfExperiences = yearOfExperiences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void joinDailyMeeting();

    public abstract void takeARest();

    public abstract void goHome();

}
