import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Student> students = new ArrayList<>(); // List to store students
    private static final Scanner scanner = new Scanner(System.in); // Scanner for user input

    public static void main(String[] args) {
        while (true) {
            // Display menu options
            System.out.println("\n1. Add Student  2. Display All  3. Search  4. Exit");
            switch (scanner.nextInt()) {
                case 1 -> addStudent();
                case 2 -> displayAll();
                case 3 -> searchStudent();
                case 4 -> { 
                    System.out.println("Exiting..."); 
                    scanner.close(); 
                    return; 
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    // Method to add a new student
    private static void addStudent() {
        scanner.nextLine(); 
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
    
        System.out.print("Address: ");
        String address = scanner.nextLine();
    
        System.out.print("Major: ");
        String major = scanner.nextLine();
    
        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();
    
        students.add(new Student(name, age, address, major, gpa));
    }

    // Method to display all students
    private static void displayAll() {
        students.forEach(Student::displayDetails);
        if (students.isEmpty()) System.out.println("No students.");
    }

    // Method to search for a student by ID
    private static void searchStudent() {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        
        // Search for student by ID
        students.stream().filter(s -> s.getStudentId().equals(id)).findFirst()
                .ifPresentOrElse(Student::displayDetails, () -> System.out.println("Not found."));
    }
}
