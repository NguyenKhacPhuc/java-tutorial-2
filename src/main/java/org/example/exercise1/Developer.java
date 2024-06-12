package org.example.exercise1;

public class Developer extends Employee {
    private String skills;
    private String programingLanguages;

    public Developer(int yearOfExperiences, String name, String gender, String skills, String programingLanguages) {
        super(yearOfExperiences, name, gender);
        this.skills = skills;
        this.programingLanguages = programingLanguages;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getProgramingLanguages() {
        return programingLanguages;
    }

    public void setProgramingLanguages(String programingLanguages) {
        this.programingLanguages = programingLanguages;
    }

    @Override
    public void joinDailyMeeting() {
        System.out.println(getName() + "join daily meeting");
    }

    @Override
    public void takeARest() {
        System.out.println("take a rest");
    }

    @Override
    public void goHome() {
        System.out.println("go home");
    }

    public void code(boolean bug) {
        if (bug) {
            System.out.println("Code and done");
            debug();
        } else {
            System.out.println("Code have bug");
            debug();
        }
    }

    public void debug() {
        System.out.println("Fix bug and done");
    }
}
