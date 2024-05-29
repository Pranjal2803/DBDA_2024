import java.util.Scanner;

public class Emp {
    // Instance variables
    int empno;
    String empname;
    String designation;
    String dept;
    double salary;
    
    // Method to read employee data from user input
    public void readEmpData() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee number: ");
        empno = sc.nextInt();
        
        System.out.println("Enter employee name: ");
        empname = sc.next();
        
        System.out.println("Employee Designation: ");
        designation = sc.next();
        
        System.out.println("Department: ");
        dept = sc.next();
        
        System.out.println("Salary: ");
        salary = sc.nextDouble();
    }
    
    // Method to display employee data
    public void displayEmpData() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + empname);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create 
