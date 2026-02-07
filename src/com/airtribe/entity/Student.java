package com.airtribe.entity;

import com.airtribe.util.IdGenerator;

public class Student extends Person{

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String batch;
    private boolean active;

    public Student( String firstName, String lastName, String email, String batch, boolean active) {
        super();
        this.id = IdGenerator.getNextStudentId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.batch = batch;
        this.active = active;
    }

    public Student(String firstName, String lastName, String batch, boolean active) {
        super();
        this.id = IdGenerator.getNextStudentId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.batch = batch;
        this.active = active;
    }

    public Student(String name) {
        super();
        this.firstName = name;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
