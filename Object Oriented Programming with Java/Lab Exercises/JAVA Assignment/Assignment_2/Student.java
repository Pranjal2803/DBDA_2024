import java.util.Scanner;

public class Student {
    // Instance variables
    int id;
    String name;
    double mark;
    String result;

    // Method to read student details from user input
    public void readStudentDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student ID");
        id = sc.nextInt();
        
        System.out.println("Enter Student Name");
        name = sc.next();
        
        System.out.println("Enter Student Mark");
        mark = sc.nextDouble();
    }

    // Method to calculate student result based on marks
    public String calculateResult() {
        if (mark >= 50) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        return result;
    }

    // Method to display student details including result
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Mark: " + mark);
        System.out.println("Student Result: " + result);
    }

    public static void main(String[] args) {
        // Create an instance of the Student class
        Student s1 = new Student();
        
        // Read student details
        s1.readStudentDetails();
        
        // Calculate student result
        s1.calculateResult();
        
        // Display student details including result
        s1.displayDetails();
    }
}

