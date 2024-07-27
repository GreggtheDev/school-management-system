package school.management;


// This class represents a Student with a name, age, and grade.
public class Student {
    private String name;
    private int age;
    private String grade;

    /* Constructor to initialize a Student object.@param name the name of the student
    @param age the age of the student @param grade the grade of the student */
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Gets name of student
    public String getName() {
        return name;
    }

    // Sets name of student
    public void setName(String name) {
        this.name = name;
    }

    // Gets age of student
    public int getAge() {
        return age;
    }

    // Sets age of student
    public void setAge(int age) {
        this.age = age;
    }

    // Gets grade of student
    public String getGrade() {
        return grade;
    }

    // Sets grade of student
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
