package org.example.Exception.Ex1;

public class Manager extends Employee {
    private String domain;
    private String hasBaseTech;

    public Manager(double yearOfExperiences, String name, String gender, String domain, String hasBaseTech) {
        super(yearOfExperiences, name, gender);
        this.domain = domain;
        this.hasBaseTech = hasBaseTech;
    }

    public String getDoMain() {
        return domain;
    }

    public void setDoMain(String domain) {
        if (this.domain != null) {
            this.domain = domain;
        } else {
            System.out.println("Invalid do main");
        }
    }

    public String getHasBaseTech() {
        return hasBaseTech;
    }

    public void setHasBaseTech(String hasBaseTech) {
        if (this.hasBaseTech != hasBaseTech) {
            this.hasBaseTech = hasBaseTech;
        } else {
            System.out.println("Invalid has base");
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

    public void manager() {
        System.out.println(getName() + " still manager");
    }

    public void holdMeeting() {
        System.out.println(" the meeting is still in running");
    };
}
