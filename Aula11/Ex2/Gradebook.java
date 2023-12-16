package Aula11.Ex2;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

public class Gradebook implements IGradeCalculator{
    private IGradeCalculator calculator;
    private List<Student> students = new ArrayList<Student>();

    public Gradebook() {
        this.students = new ArrayList<Student>();
    }

    public double calculate(List<Double> grades) {
        return calculator.calculate(grades);
    }

    public void removeStudent(String student) {
        for(Student aluno : students){
            if(aluno.getName().contains(student)){
                students.remove(aluno);
                System.out.println("Aluno removido com sucesso!");
                return;

            }
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String student) {
        for(Student aluno : students){
            if(aluno.getName().equals(student)){
                return aluno;
            }
        }
        return null;
        
    }

    public double calculateAverageGrade(String nome) {
        double sum = 0;
        double average = 0;
        for(Student aluno : students){
            if(aluno.getName().equals(nome)){
                List<Double> grades = aluno.getGrades();
                sum = 0;
                for(double grade : grades){
                    sum += grade;
                }
                average = sum/grades.size();
            }
        }
        return average;
    }

    public void load(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String[] tokens = scanner.nextLine().split("\\|");
            String name = tokens[0];
            List<Double> grades = new ArrayList<>();
            for (int i = 1; i < tokens.length; i++) {
                grades.add(Double.parseDouble(tokens[i]));
            }
            Student student = new Student(name, grades);
            addStudent(student);
        }
        scanner.close();
    }

    public void printAllStudents() {
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        for (Student student : students) {
            System.out.println(student);
        }
    }

}