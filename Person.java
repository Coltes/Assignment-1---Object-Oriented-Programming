// Abstract base class representing a Person
public abstract class Person {
    private String name;  
    private int age;      
    private String address; 

    // Constructor to initialize Person attributes
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters and setters for encapsulation
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Abstract method without a body 
    public abstract void displayDetails();
}