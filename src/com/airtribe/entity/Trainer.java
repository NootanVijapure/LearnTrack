package com.airtribe.entity;

import com.airtribe.util.IdGenerator;

public class Trainer extends Person{
    private int id;
    private String expertise;
    boolean availability;
    String company;

    public Trainer(int id, String subject, boolean availability, String company) {
        this.id =  IdGenerator.getNextTrainerId();;
        this.expertise = subject;
        this.availability = availability;
        this.company = company;
    }

    public int getId() {
        return id;
    }


    public String getSubject() {
        return expertise;
    }

    public void setSubject(String subject) {
        this.expertise = subject;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
