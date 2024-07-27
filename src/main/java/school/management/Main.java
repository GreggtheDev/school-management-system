package school.management;

public class Main {
    public static void main(String[] args) {
        // Create a school object with the name "Greenwood High"
        School school = new School("Greenwood High");

        // Create two student objects
        Student student1 = new Student("Alice", 14, "8th Grade");
        Student student2 = new Student("Bob", 15, "9th Grade");

        // Create two teacher objects
        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", "English");

        // Add the students and teachers to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        // Print the school information
        System.out.println("School Name: " + school.getName());
        System.out.println("Students:");
        for (Student student : school.getStudents()) {
            System.out.println(" - " + student.getName() + ", " + student.getAge() + " years old, " + student.getGrade());
        }

        System.out.println("Teachers:");
        for (Teacher teacher : school.getTeachers()) {
            System.out.println(" - " + teacher.getName() + ", teaches " + teacher.getSubject());
        }
    }
}

