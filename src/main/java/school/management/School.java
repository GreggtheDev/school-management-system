package school.management;

import java.util.ArrayList;
import java.util.List;

// School class with name, student and teachers
public class School {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;

    // Constructor to initialize school object
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    // Adds student ot the school
    public void addStudent(Student student) {
        students.add(student);
    }
