package com.airtribe.service;

import com.airtribe.entity.Enrollment;
import com.airtribe.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();

    public void enrollStudent(int studentId, int courseId) {
        enrollments.add(new Enrollment(studentId, courseId));
    }

    public List<Enrollment> getEnrollmentsForStudent(int studentId) {
        return enrollments.stream()
                .filter(e -> e.getStudentId() == studentId)
                .collect(Collectors.toList());
    }
    public Enrollment findEnrollmentById(int id)
            throws EntityNotFoundException {

        return enrollments.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "Enrollment not found"));
    }

    public void updateStatus(int enrollmentId,
                             Enrollment.Status status)
            throws EntityNotFoundException {

        Enrollment e = findEnrollmentById(enrollmentId);
        e.setStatus(status);
    }
    public List<Enrollment> getAll() {
        return enrollments;
    }
}
