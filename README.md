
# School Management System

## Introduction
This project is a simple School Management System implemented in Java. It demonstrates the basic concepts of object-oriented programming such as classes, objects, inheritance, and encapsulation. The system includes basic functionalities to manage students, teachers, and the school itself.

## Project Structure
The project structure is as follows:

```
school-management-system/
├── .idea/
├── src/
│   └── main/
│       └── java/
│           └── school/
│               └── management/
│                   ├── Main.java
│                   ├── School.java
│                   ├── Student.java
│                   └── Teacher.java
└── resources/
    └── test/
.gitignore
pom.xml
```

## Classes and Their Responsibilities

### 1. `Main.java`
- Entry point of the application.
- Creates instances of `School`, `Student`, and `Teacher` classes.
- Adds students and teachers to the school.
- Prints out the school information.

### 2. `School.java`
- Represents a school.
- Manages a list of students and teachers.
- Provides methods to add students and teachers.
- Provides methods to retrieve the list of students and teachers.

### 3. `Student.java`
- Represents a student.
- Stores student's name, age, and grade.
- Provides getter and setter methods for student's properties.

### 4. `Teacher.java`
- Represents a teacher.
- Stores teacher's name and subject.
- Provides getter and setter methods for teacher's properties.

## How to Run the Project

### Prerequisites
- Java Development Kit (JDK) installed.
- An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse.

### Steps
1. Clone the repository to your local machine.
    ```sh
    git clone <repository_url>
    ```

2. Open the project in your IDE.

3. Ensure the project structure matches the one shown above.

4. Run the `Main.java` file.
    - In IntelliJ IDEA: Right-click on `Main.java` -> Run 'Main.main()'.
    - In Eclipse: Right-click on `Main.java` -> Run As -> Java Application.

## Example Output
When you run the `Main` class, you should see an output similar to this:
```
School Name: Greenwood High
Students:
 - Alice, 14 years old, 8th Grade
 - Bob, 15 years old, 9th Grade
Teachers:
 - Mr. Smith, teaches Mathematics
 - Ms. Johnson, teaches English
```

## Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

## Contact
For any questions or suggestions, please open an issue in the repository.

```

This `README.md` file provides an overview of the project, the structure of the project, detailed descriptions of each class, and instructions on how to run the project. It also includes sections for contributing, licensing, and contact information.
