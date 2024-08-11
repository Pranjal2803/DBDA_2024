package q4;
//This line specifies that the Motorcycle class belongs to the "q4" package. A package is a group of related classes.

public class Motorcycle extends Vehicle {
	// The Motorcycle class is defined here. This class represents a motorcycle and extends the Vehicle class.

    public String type;
 // This line declares a variable named type to store the type of the motorcycle.

    public Motorcycle(String vehicleNumber, String type) {
    	// This is a constructor for the Motorcycle class. A constructor is a special method used to initialize objects.
        // The "Motorcycle(String vehicleNumber, String type)" constructor takes two parameters: vehicleNumber and type, which represent the vehicle number and type of the motorcycle.
        super(vehicleNumber);
     // This line calls the constructor of the superclass (Vehicle) and passes the vehicleNumber parameter to it.
        this.type = type;
     // This line assigns the value of the parameter type to the instance variable type.
    }

    @Override
    // The "@Override" annotation indicates that this method overrides the toString() method in the superclass.
    public String toString() {
    	 // This is an overridden method named toString from the superclass (Vehicle).
    	// The "public" keyword means that this method can be accessed from outside the class.
        // The "String" keyword indicates that this method returns a string (a sequence of characters).
        return "Motorcycle [Type: " + type + ", " + super.toString() + "]";
     // This line returns a string representation of the motorcycle, including its type and vehicle number.

    }
}