package q4;
//This line specifies that the Main class belongs to the "q4" package. A package is a group of related classes.

public class Main {
	// The Main class is defined here. This class contains the main method which is the entry point of the program.

    public static void main(String[] args) {
    	// This is the main method. It is the entry point of the program.
        Vehicle car = new Car("C123", "Toyota Corolla");
     // Create an instance of the Car class and assign it to a variable named car.
        // The "new" keyword is used to create a new object (instance) of the Car class.
        // The Car("C123", "Toyota Corolla") constructor is called to initialize the new object with vehicle number "C123" and model "Toyota Corolla".
        Vehicle motorcycle = new Motorcycle("M456", "Sport");
     // Create an instance of the Motorcycle class and assign it to a variable named motorcycle.
        // The Motorcycle("M456", "Sport") constructor is called to initialize the new object with vehicle number "M456" and type "Sport".
        Vehicle bicycle = new Bicycle("B789", 21);
        // Create an instance of the Bicycle class and assign it to a variable named bicycle.
        // The Bicycle("B789", 21) constructor is called to initialize the new object with vehicle number "B789" and 21 gears.

        System.out.println(car);
     // Print the string representation of the car object.
        System.out.println(motorcycle);
     // Print the string representation of the motorcycle object.
        System.out.println(bicycle);
     // Print the string representation of the bicycle object.

        System.out.println("\nRenting vehicles...");
        // Print a message indicating that the vehicles are being rented.
        if (car.rent()) {
        	 // Attempt to rent the car. If successful, print a success message; otherwise, print an availability message
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is not available.");
        }
     // Attempt to rent the motorcycle. If successful, print a success message; otherwise, print an availability message.

        if (motorcycle.rent()) {
            System.out.println("Motorcycle rented successfully.");
        } else {
            System.out.println("Motorcycle is not available.");
        }
        // Attempt to rent the bicycle. If successful, print a success message; otherwise, print an availability message.

        if (bicycle.rent()) {
            System.out.println("Bicycle rented successfully.");
        } else {
            System.out.println("Bicycle is not available.");
        }
     // Print the string representation of the vehicles after attempting to rent them.
        System.out.println("\nAfter renting:");
        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);

     // Print a message indicating that the vehicles are being returned.
        System.out.println("\nReturning vehicles...");
     // Attempt to return the car. If successful, print a success message; otherwise, print a rented status message.
        if (car.returnVehicle()) {
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car was not rented.");
        }
     // Attempt to return the motorcycle. If successful, print a success message; otherwise, print a rented status message.

        if (motorcycle.returnVehicle()) {
            System.out.println("Motorcycle returned successfully.");
        } else {
            System.out.println("Motorcycle was not rented.");
        }
     // Attempt to return the bicycle. If successful, print a success message; otherwise, print a rented status message.

        if (bicycle.returnVehicle()) {
            System.out.println("Bicycle returned successfully.");
        } else {
            System.out.println("Bicycle was not rented.");
        }

     // Print the string representation of the vehicles after attempting to return them.
        System.out.println("\nAfter returning:");
        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);
    }
}
