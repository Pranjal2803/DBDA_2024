package q4;
//This line specifies that the Bicycle class belongs to the "q4" package. A package is a group of related classes.
public class Bicycle extends Vehicle {
	// The Bicycle class is defined here. This class represents a bicycle and extends the Vehicle class.
    public int gearCount;
 // This line declares a variable named gearCount to store the number of gears of the bicycle.

    public Bicycle(String vehicleNumber, int gearCount) {
    	// This is a constructor for the Bicycle class. A constructor is a special method used to initialize objects.
        // The "Bicycle(String vehicleNumber, int gearCount)" constructor takes two parameters: vehicleNumber and gearCount, which represent the vehicle number and gear count of the bicycle.
        super(vehicleNumber);
     // This line calls the constructor of the superclass (Vehicle) and passes the vehicleNumber parameter to it.
        this.gearCount = gearCount;
     // This line assigns the value of the parameter gearCount to the instance variable gearCount.
    }

    @Override
    // The "@Override" annotation indicates that this method overrides the toString() method in the superclass.
    public String toString() {
    	// This is an overridden method named toString from the superclass (Vehicle).
    	// The "public" keyword means that this method can be accessed from outside the class.
        // The "String" keyword indicates that this method returns a string (a sequence of characters).
        return "Bicycle [Gear Count: " + gearCount + ", " + super.toString() + "]";
     // This line returns a string representation of the bicycle, including its gear count and vehicle number.
    }
}