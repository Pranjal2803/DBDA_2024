package q4;
//This line specifies that the Car class belongs to the "q4" package. A package is a group of related classes.
public class Car extends Vehicle {
	// The Car class is defined here. This class represents a car and extends the Vehicle class.
    public String model;
 // This line declares a variable named model to store the model of the car.

    public Car(String vehicleNumber, String model) {
    	// This is a constructor for the Car class. A constructor is a special method used to initialize objects.
        // The "Car(String vehicleNumber, String model)" constructor takes two parameters: vehicleNumber and model, which represent the vehicle number and model of the car.
        super(vehicleNumber);
     // This line calls the constructor of the superclass (Vehicle) and passes the vehicleNumber parameter to it.
        this.model = model;
     // This line assigns the value of the parameter model to the instance variable model.
    }

    @Override
 // The "@Override" annotation indicates that this method overrides the toString() method in the superclass.
    public String toString() {
    	// This is an overridden method named toString from the superclass (Vehicle).
    	// The "public" keyword means that this method can be accessed from outside the class.
        // The "String" keyword indicates that this method returns a string (a sequence of characters).
        return "Car [Model: " + model + ", " + super.toString() + "]";
     // This line returns a string representation of the car, including its model and vehicle number.
    }
}
