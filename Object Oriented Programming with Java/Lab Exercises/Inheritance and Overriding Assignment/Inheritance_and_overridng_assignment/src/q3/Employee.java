package q3;
//This line specifies that the Employee class belongs to the "q3" package. A package is a group of related classes.

abstract class Employee {
	// The Employee class is defined here. This class is declared as abstract, meaning it cannot be instantiated directly.
	public String name;
	// This line declares a variable named name to store the name of the employee.
	public double baseSalary;
	// This line declares a variable named baseSalary to store the base salary of the employee.

	    Employee(String name, double baseSalary) {
	    	// This is a constructor for the Employee class. A constructor is a special method used to initialize objects.
	        // The "Employee(String name, double baseSalary)" constructor takes two parameters: name and baseSalary, which represent the name and base salary of the employee.
	        this.name = name;
	     // This line assigns the value of the parameter name to the instance variable name.
	        this.baseSalary = baseSalary;
	     // This line assigns the value of the parameter baseSalary to the instance variable baseSalary.
	    }

	    abstract double calculateSalary();
	 // This is an abstract method named calculateSalary. An abstract method is a method that is declared but not implemented.
	    // The "abstract" keyword means that this method does not have a body and must be implemented by subclasses.
	    // The "double" keyword indicates that this method returns a double (a floating-point number).
	}


