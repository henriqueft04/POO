package Aula11.Ex2;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class GradebookTester {
    public static void main(String[] args) {
        // Create a new Gradebook instance
        Gradebook gradebook = new Gradebook();

        // Load the student data from a text file
        try {
            gradebook.load("src\\Aula11\\Ex2\\alunos.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
            e.printStackTrace();
            return;
        }

        // Add a new student to the collection
        List<Double> list = new ArrayList<>(Arrays.asList(10.0, 15.0, 19.0));;
        Student newStudent = new Student("Johny May", new ArrayList<>(list));
        gradebook.addStudent(newStudent);

        // Remove a student from the collection
        gradebook.removeStudent("Jane Smith");

        // Retrieve a student from the collection
        Student student = gradebook.getStudent("John Doe");
        System.out.println("Student retrieved: " + student);

        // Calculate the average grade for a specific student
        double averageGrade = gradebook.calculateAverageGrade("John Doe");
        System.out.println("Average grade for John Doe: " + averageGrade);

        // Print a summary of all students in the collection
        gradebook.printAllStudents();
    }
}

