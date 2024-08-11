package q3;
//This line specifies that the Manager class belongs to the "q3" package. A package is a group of related classes.
class Manager extends Employee {
	// The Manager class is defined here. This class represents a manager and extends the Employee class.
    public double bonus;
 // This line declares a variable named bonus to store the bonus of the manager.

    Manager(String name, double baseSalary, double bonus) {
    	// This is a constructor for the Manager class. A constructor is a special method used to initialize objects.
        // The "Manager(String name, double baseSalary, double bonus)" constructor takes three parameters: name, baseSalary, and bonus, which represent the name, base salary, and bonus of the manager.
        super(name, baseSalary);
     // This line calls the constructor of the superclass (Employee) and passes the name and baseSalary parameters to it.
        this.bonus = bonus;
     // This line assigns the value of the parameter bonus to the instance variable bonus.
    }

    @Override
 // This is an overridden method named calculateSalary from the superclass (Employee).
    double calculateSalary() {
    	// The "@Override" annotation indicates that this method overrides the calculateSalary() method in the superclass.
        // The "double" keyword indicates that this method returns a double (a floating-point number).
        // The "calculateSalary()" method does not take any parameters.
        return baseSalary + bonus;
     // This line calculates the total salary of the manager by adding the base salary and bonus, and returns it.

    }
}