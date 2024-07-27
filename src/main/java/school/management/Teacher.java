package school.management;

// Teacher Class with name and subject
public class Teacher {
    private String name;
    private String subject;

    // Constructor to initialize Teacher object
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Gets teacher name
    public String getName() {
        return name;
    }

    // Sets name of teacher
    public void setName(String name) {
        this.name = name;
    }

    // Gets subject teacher teches
    public String getSubject() {
        return subject;
    }

    // Sets subject teacher teaches
    public void setSubject(String subject) {
        this.subject = subject;
    }
}

