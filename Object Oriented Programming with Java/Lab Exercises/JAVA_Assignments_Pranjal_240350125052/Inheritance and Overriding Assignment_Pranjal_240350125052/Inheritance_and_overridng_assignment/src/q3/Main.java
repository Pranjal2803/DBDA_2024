package q3;
//This line specifies that the Main class belongs to the "q3" package. A package is a group of related classes.
public class Main {
	// The Main class is defined here. This class serves as the entry point of the program.
    public static void main(String[] args) {
    	// This is the main method. It is a special method that serves as the entry point for Java applications.
        // The "public" keyword means that this method can be accessed from outside the class.
        // The "static" keyword means that this method belongs to the class itself, not to instances of the class.
        // The "void" keyword means that this method does not return any value.
        // The "main(String[] args)" method takes an array of strings as input parameters.
        Employee manager = new Manager("Alice", 5000, 2000);
     // Create an instance of the Manager class and assign it to a variable named manager.
        // The "new" keyword is used to create a new object (instance) of the Manager class.
        // The Manager("Alice", 5000, 2000) constructor is called to initialize the new object with name "Alice", base salary 5000, and bonus 2000.
        Employee engineer = new Engineer("Bob", 4000, 1500);
     // Create an instance of the Engineer class and assign it to a variable named engineer.
        // The "new" keyword is used to create a new object (instance) of the Engineer class.
        // The Engineer("Bob", 4000, 1500) constructor is called to initialize the new object with name "Bob", base salary 4000, and project allowance 1500.

        System.out.println(manager.name + "'s Salary: " + manager.calculateSalary());
     // Print the manager's name followed by "'s Salary: " and the result of calling the calculateSalary() method on the manager object.

        System.out.println(engineer.name + "'s Salary: " + engineer.calculateSalary());
     // Print the engineer's name followed by "'s Salary: " and the result of calling the calculateSalary() method on the engineer object.
    }
}