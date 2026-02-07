package com.airtribe.ui;

import com.airtribe.entity.Course;
import com.airtribe.entity.Enrollment.Status;
import com.airtribe.entity.Student;
import com.airtribe.exception.EntityNotFoundException;
import com.airtribe.service.CourseService;
import com.airtribe.service.EnrollmentService;
import com.airtribe.service.StudentService;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while (true) {

            System.out.println("\n==== MAIN MENU ====");
            System.out.println("1 Student Management");
            System.out.println("2 Course Management");
            System.out.println("3 Enrollment Management");
            System.out.println("4 Exit");

            try {

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    // ================= STUDENT MANAGEMENT =================
                    case 1:

                        System.out.println("\n1 Add Student");
                        System.out.println("2 View Students");
                        System.out.println("3 Search Student");
                        System.out.println("4 Deactivate Student");

                        int sm = Integer.parseInt(sc.nextLine());

                        switch (sm) {

                            case 1:
                                System.out.print("First Name:");
                                String fn = sc.nextLine();

                                System.out.print("Last Name:");
                                String ln = sc.nextLine();

                                Student s = new Student(
                                        fn,
                                        ln,
                                        "test@mail.com",
                                        "Batch1",
                                        true
                                );

                                studentService.addStudent(s);
                                break;

                            case 2:
                                studentService.listStudents()
                                        .forEach(st ->
                                                System.out.println(
                                                        st.getId()
                                                                + " "
                                                                + st.getFirstName()
                                                                + " Active:"
                                                                + st.isActive()));
                                break;

                            case 3:
                                System.out.print("Student Id:");
                                int sid = Integer.parseInt(sc.nextLine());

                                Student found =
                                        studentService.findStudentById(sid);

                                System.out.println(
                                        found.getFirstName());
                                break;

                            case 4:
                                System.out.print("Student Id:");
                                int did = Integer.parseInt(sc.nextLine());

                                studentService.deactivateStudent(did);
                                break;

                            default:
                                System.out.println("Invalid option");
                        }
                        break;

                    // ================= COURSE MANAGEMENT =================
                    case 2:

                        System.out.println("\n1 Add Course");
                        System.out.println("2 View Courses");
                        System.out.println("3 Toggle Course Active");

                        int cm = Integer.parseInt(sc.nextLine());

                        switch (cm) {

                            case 1:
                                System.out.print("Course Name:");
                                String cname = sc.nextLine();

                                Course c =
                                        new Course(
                                                cname,
                                                "desc",
                                                "8",
                                                true);

                                courseService.addCourse(c);
                                break;

                            case 2:
                                courseService.listCourses()
                                        .forEach(co ->
                                                System.out.println(
                                                        co.getId()
                                                                + " "
                                                                + co.getCourseName()
                                                                + " Active:"
                                                                + co.isActive()));
                                break;

                            case 3:
                                System.out.print("Course Id:");
                                int cid =
                                        Integer.parseInt(sc.nextLine());

                                courseService
                                        .toggleCourseActive(cid);
                                break;

                            default:
                                System.out.println("Invalid option");
                        }
                        break;

                    // ================= ENROLLMENT MANAGEMENT =================
                    case 3:

                        System.out.println("\n1 Enroll Student");
                        System.out.println("2 View Student Enrollments");
                        System.out.println("3 Update Enrollment Status");

                        int em = Integer.parseInt(sc.nextLine());

                        switch (em) {

                            case 1:
                                System.out.print("Student Id:");
                                int sid =
                                        Integer.parseInt(sc.nextLine());

                                System.out.print("Course Id:");
                                int cid =
                                        Integer.parseInt(sc.nextLine());

                                studentService.findStudentById(sid);
                                courseService.findCourseById(cid);

                                enrollmentService
                                        .enrollStudent(sid, cid);
                                break;

                            case 2:
                                System.out.print("Student Id:");
                                int vid =
                                        Integer.parseInt(sc.nextLine());

                                enrollmentService
                                        .getEnrollmentsForStudent(vid)
                                        .forEach(e ->
                                                System.out.println(
                                                        e.getId()
                                                                + " Course:"
                                                                + e.getCourseId()
                                                                + " Status:"
                                                                + e.getStatus()));
                                break;

                            case 3:
                                System.out.print("Enrollment Id:");
                                int eid =
                                        Integer.parseInt(sc.nextLine());

                                System.out.println(
                                        "1 COMPLETED 2 CANCELLED");

                                int st =
                                        Integer.parseInt(sc.nextLine());

                                Status status =
                                        st == 1
                                                ? Status.COMPLETED
                                                : Status.CANCELLED;

                                enrollmentService
                                        .updateStatus(eid, status);
                                break;

                            default:
                                System.out.println("Invalid option");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid option");
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter valid number");
            } catch (EntityNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
