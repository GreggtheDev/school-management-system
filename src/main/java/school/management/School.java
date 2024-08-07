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

    // Adds teacher to school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Getter for list of students
    public List<Student> getStudents() {
        return students;
    }

    // Getters for list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // Gets name of school
    public String getName() {
        return name;
    }
}
