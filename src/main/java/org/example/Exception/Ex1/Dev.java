package org.example.Exception.Ex1;

public class Dev extends Employee {

    private String skills;
    private String programingLanguages;

    public Dev(double yearOfExperiences, String name, String gender, String skills, String programingLanguages) {
        super(yearOfExperiences, name, gender);
        this.skills = skills;
        this.programingLanguages = programingLanguages;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills)

    {
        if (this.skills != null) {
            this.skills = skills;
        } else {
            System.out.println("Invalid skills");
        }
    }

    public String getProgramingLanguages() {
        return programingLanguages;
    }

    public void setProgramingLanguages(String programingLanguages) {
        if (this.programingLanguages != null) {
            this.programingLanguages = programingLanguages;
        } else {
            System.out.println(" Invalid programing languages");
        }
    }

    public void joinDailyMeeting() {
        System.out.println(getName() + " join meeting ");
    };

    public void takeARest() {
        System.out.println(" take a rest");
    };

    public void goHome() {
        System.out.println(" go home");
    };

    public static void code() {
        System.out.println(" coding next part of app");
    };

    public static void debug() {
        System.out.println(" fix bug");
    }
}
