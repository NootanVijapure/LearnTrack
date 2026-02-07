package com.airtribe.entity;

import com.airtribe.util.IdGenerator;

public class Course {
    private int courseId;
    private String courseName;
    private String description;
    private String durationInWeeks;
    private boolean active;

    public Course( String courseName, String description, String durationInWeeks, boolean active) {
        this.courseId = IdGenerator.getNextCourseId();;
        this.courseName = courseName;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.active = active;
    }

    public int getId() {
        return courseId;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(String durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
