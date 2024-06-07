package org.example.Exception.Ex1;

public class Tester extends Employee {
    private String skills;
    private String level;

    public Tester(double yearOfExperiences, String name, String gender, String skills, String level) {
        super(yearOfExperiences, name, gender);
        this.skills = skills;
        this.level = level;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        if (this.level != null) {
            this.level = level;
        } else {
            System.out.println("Invalid level");
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

    public static void test() {
        System.out.println(" test code dev just finish");
    };

    public void writeDocument() {
        System.out.println(" hey dev, new error in this line");
    };
}
