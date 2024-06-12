package org.example.exercise1;

public class Tester extends Employee {
    private String skills;
    private String level;

    public Tester(int yearOfExperiences, String name, String gender, String skills, String level) {
        super(yearOfExperiences, name, gender);
        this.skills = skills;
        this.level = level;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    public void test() {
        System.out.println("Test dev's code");
    }

    ;

    public void writeDocument() {
        System.out.println("Have error in this line");
    }

    ;
}
