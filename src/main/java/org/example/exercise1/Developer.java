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

    }

    @Override
    public void takeARest() {

    }

    @Override
    public void goHome() {

    }
}
