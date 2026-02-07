package com.airtribe.service;

import com.airtribe.entity.Student;
import com.airtribe.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    // add student object
    public void addStudent(Student student) {
        students.add(student);
    }

    // overloaded method
    public void addStudent(String name) {
        students.add(new Student(name));
    }

    // find student
    public Student findStudentById(int studentId)
            throws EntityNotFoundException {

        return students.stream()
                .filter(s -> s.getId() == studentId)
                .findFirst()
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "Student not found"));
    }

    // update student
    public void updateStudent(int studentId,
                              String newName)
            throws EntityNotFoundException {

        Student s = findStudentById(studentId);
        s.setFirstName(newName);
    }

    // deactivate instead of delete
    public void deactivateStudent(int studentId)
            throws EntityNotFoundException {

        Student s = findStudentById(studentId);
        s.setActive(false);
    }

    // list students
    public List<Student> listStudents() {
        return students;
    }
}
