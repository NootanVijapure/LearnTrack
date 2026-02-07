package com.airtribe.service;


import com.airtribe.entity.Course;
import com.airtribe.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private List<Course> courses = new ArrayList<>();

    // add new course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // find course by id
    public Course findCourseById(int courseId)
            throws EntityNotFoundException {

        return courses.stream()
                .filter(c -> c.getId() == courseId)
                .findFirst()
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "Course not found"));
    }

    // list all courses
    public List<Course> listCourses() {
        return courses;
    }

    // activate/deactivate course
    public void toggleCourseActive(int courseId)
            throws EntityNotFoundException {

        Course c = findCourseById(courseId);
        c.setActive(!c.isActive());
    }
}
