package org.example.exercise1;

public class Manager extends Employee{
    private String domain;
    private String hasBaseTech;

    public Manager(int yearOfExperiences, String name, String gender, String domain, String hasBaseTech) {
        super(yearOfExperiences, name, gender);
        this.domain = domain;
        this.hasBaseTech = hasBaseTech;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getHasBaseTech() {
        return hasBaseTech;
    }

    public void setHasBaseTech(String hasBaseTech) {
        this.hasBaseTech = hasBaseTech;
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
