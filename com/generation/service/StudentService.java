package com.generation.service;

import com.generation.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent(String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary() {

        //TODO implement
        System.out.println( "Subscribed Student:" );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println( students);
        }
        System.out.println( "Enrolled Students" );
        for ( String key : students.keySet() ) {
            //List<Student> students = enrollToCourse.get(key);
            System.out.println("Students on Course " + key + ": ");
            //for (Student student : students) {
                System.out.println(students);
            }
        }


    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
