package q2;
//This line specifies that the Circle class belongs to the "q2" package. A package is a group of related classes.
public class Circle extends shape{
// The Circle class is defined here. This class represents a circle and extends the shape class.
	double radius;
	// This line declares a variable named radius to store the radius of the circle.

	
	

	public Circle(double radius) {
		// This is a constructor for the Circle class. A constructor is a special method used to initialize objects.
	   // The "public" keyword means that this constructor can be accessed from outside the class.
	   // The "Circle(double radius)" constructor takes a parameter named radius, which represents the radius of the circle.
		super();
		// This line calls the constructor of the superclass (shape), if it exists.
		this.radius = radius;
		// This line assigns the value of the parameter radius to the instance variable radius.
	}




	public double calculateArea(){
		// This is the implementation of the abstract method calculateArea() from the shape class.
	    // The "public" keyword means that this method can be accessed from outside the class.
	    // The "double" keyword indicates that this method returns a double (a floating-point number).
	    // The "calculateArea()" method does not take any parameters.
		double Area = 3.14* radius * radius;
		// This line calculates the area of the circle using the formula π * radius^2 and stores it in the variable named Area.
		return Area;
		// This line returns the calculated area.
	}


}

