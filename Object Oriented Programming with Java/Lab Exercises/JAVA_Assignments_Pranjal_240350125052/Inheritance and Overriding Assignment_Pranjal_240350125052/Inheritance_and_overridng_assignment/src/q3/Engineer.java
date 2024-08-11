package q3;
//This line specifies that the Engineer class belongs to the "q3" package. A package is a group of related classes.

class Engineer extends Employee {
	// The Engineer class is defined here. This class represents an engineer and extends the Employee class.
    public double projectAllowance;
 // This line declares a variable named projectAllowance to store the project allowance of the engineer.

    Engineer(String name, double baseSalary, double projectAllowance) {
    	// This is a constructor for the Engineer class. A constructor is a special method used to initialize objects.
        // The "Engineer(String name, double baseSalary, double projectAllowance)" constructor takes three parameters: name, baseSalary, and projectAllowance, which represent the name, base salary, and project allowance of the engineer.
        super(name, baseSalary);
     // This line calls the constructor of the superclass (Employee) and passes the name and baseSalary parameters to it.
        this.projectAllowance = projectAllowance;
     // This line assigns the value of the parameter projectAllowance to the instance variable projectAllowance.
    }

    @Override
    // The "@Override" annotation indicates that this method overrides the calculateSalary() method in the superclass.
    double calculateSalary() {
    	 // This is an overridden method named calculateSalary from the superclass (Employee).
    	// The "double" keyword indicates that this method returns a double (a floating-point number).
        // The "calculateSalary()" method does not take any parameters.
        return baseSalary + projectAllowance;
     // This line calculates the total salary of the engineer by adding the base salary and project allowance, and returns it.
    }
}
