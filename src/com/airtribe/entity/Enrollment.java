package com.airtribe.entity;

import com.airtribe.util.IdGenerator;

import java.util.Date;

public class Enrollment {
    private int id;
    private int studentId;
    private int courseId;
    private Date enrollmentDate;
    private Status status;

    public enum Status {
        ACTIVE,
        COMPLETED,
        CANCELLED
    }

    public Enrollment(int studentId, int courseId) {
        this.id = IdGenerator.getNextEnrollmentId();
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = new Date();
        this.status = Status.ACTIVE;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

