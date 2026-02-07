package com.airtribe.util;

public class IdGenerator {
    private static int studentIdCounter = 1000;
    private static int courseIdCounter = 2000;
    private static int enrollmentIdCounter = 3000;
    private static int trainerIdCounter = 4000;

    private IdGenerator() {
        // private constructor so nobody creates object
    }

    public static int getNextStudentId() {
        return ++studentIdCounter;
    }
    public static int getNextTrainerId() {
        return ++trainerIdCounter;
    }

    public static int getNextCourseId() {
        return ++courseIdCounter;
    }


    public static int getNextEnrollmentId() {
        return ++enrollmentIdCounter;
    }
}
