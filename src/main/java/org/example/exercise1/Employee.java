package org.example.exercise1;

public abstract class Employee {
    private int yearOfExperiences;
    private String name;
    private String gender;

    public Employee(int yearOfExperiences, String name, String gender) {
        this.yearOfExperiences = yearOfExperiences;
        this.name = name;
        setGender(this.gender);
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
        if (this.gender.equals("male") || this.gender.equals("Male")) {
            this.gender = "Male";
        } else if (this.gender.equals("female") || this.gender.equals("Female")) {
            this.gender = "Female";
        }
        System.out.println("Invalid gender");
    }

    public abstract void joinDailyMeeting();

    public abstract void takeARest();

    public abstract void goHome();

}
