package com.generation.model;

import java.util.*;

public class Student // class extend, person
        extends Person
        implements Evaluation {
    private double average;

    private final List<Course> course = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date birthDate) {
        super(id, name, email, birthDate);
    }

    public void enrollToCourse(Course course) {
        //TODO implement this method


    }

    public void registerApprovedCourse(Course course) {
        approvedCourses.put(course.getCode(), course);
    }

    public boolean isCourseApproved(String courseCode) {
        //TODO implement this method
        return false;
    }


    public List<Course> findPassedCourses(Course course) {
        //TODO implement this method
        return null;

    }

    public boolean isAttendingCourse(String courseCode) {
        //TODO implement this method
        return this.isAttendingCourse(courseCode);
       // return false;
    }

    @Override
    public double getAverage() {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses() {
        //TODO implement this method
        return null;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() + "}";
    }
}
