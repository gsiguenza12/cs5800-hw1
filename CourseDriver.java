package com.company;

public class CourseDriver {
    public static void main(String[] args) {
        // Create Instructor and Textbook objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        // Create Course object
        Course course = new Course("Software Engineering", instructor1, textbook1);

        // Print course information
        course.print();

        // Modify the code to have two instructors and two textbooks
        Instructor instructor2 = new Instructor("John", "Doe", "4-1234");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

        // Create Course object with two instructors and two textbooks?
        Course course2 = new Course("Advanced Java Programming", instructor2, textbook2);

        // Print course information
        course2.print();
    }
}

