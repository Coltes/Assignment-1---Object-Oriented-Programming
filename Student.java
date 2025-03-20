public class Student extends Person {
    private static int idCounter = 1000; // Static counter to generate unique ID
    private String studentId;  
    private String major;      
    private double gpa;        

    // Constructor for Student
    public Student(String name, int age, String address, String major, double gpa) {
        super(name, age, address);
        this.studentId = "S" + (idCounter++); // Generate student ID
        this.major = major;
        this.gpa = gpa;
    }

    // Static method to generate a unique Student ID
    public static String generateStudentId() {
        return "S" + (idCounter++);
    }

    // Getters and setters for encapsulation
    public String getStudentId() { return studentId; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // Override the abstract method from Person 
    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress());
        System.out.println("Student ID: " + studentId + ", Major: " + major + ", GPA: " + gpa);
    }

}