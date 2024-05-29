package q4;
//This line specifies that the Vehicle class belongs to the "q4" package. A package is a group of related classes.
public abstract class Vehicle {
	// The Vehicle class is defined here. This class is abstract, meaning it cannot be instantiated directly and must be subclassed.
    public String vehicleNumber;
 // This line declares a variable named vehicleNumber to store the vehicle number.
    public boolean isAvailable;
 // This line declares a variable named isAvailable to store the availability status of the vehicle.

    public Vehicle(String vehicleNumber) {
    	// This is a constructor for the Vehicle class. A constructor is a special method used to initialize objects.
        // The "Vehicle(String vehicleNumber)" constructor takes one parameter: vehicleNumber, which represents the vehicle number.
        this.vehicleNumber = vehicleNumber;
     // This line assigns the value of the parameter vehicleNumber to the instance variable vehicleNumber.
        this.isAvailable = true;
     // This line sets the initial availability status of the vehicle to true (available).

    }

    public boolean rent() {
    	// This method attempts to rent the vehicle.
        // The "public" keyword means that this method can be accessed from outside the class.
        // The "boolean" keyword indicates that this method returns a boolean value (true or false).
        if (isAvailable) {
        	// This line checks if the vehicle is available.
            isAvailable = false;
         // If available, it sets the availability status to false (rented).
            return true;
         // Returns true to indicate the vehicle was successfully rented.

        } else {
            return false;
         // If not available, returns false to indicate the vehicle could not be rented.
        }
    }

    public boolean returnVehicle() {
    	// This method attempts to return the vehicle.
        // The "public" keyword means that this method can be accessed from outside the class.
        // The "boolean" keyword indicates that this method returns a boolean value (true or false).

        if (!isAvailable) {
        	// This line checks if the vehicle is not available (rented).
            isAvailable = true;
         // If rented, it sets the availability status to true (available).
            return true;
         // Returns true to indicate the vehicle was successfully returned.

        } else {
            return false;
         // If already available, returns false to indicate the vehicle could not be returned.
        }
    }

    @Override
    // The "@Override" annotation indicates that this method overrides the toString() method in the superclass.
    public String toString() {
    	 // This is an overridden method named toString from the Object class.
    	// The "public" keyword means that this method can be accessed from outside the class.
        // The "String" keyword indicates that this method returns a string (a sequence of characters).
        return "Vehicle Number: " + vehicleNumber + ", Available: " + isAvailable;
     // This line returns a string representation of the vehicle, including its number and availability status.
    }
}
