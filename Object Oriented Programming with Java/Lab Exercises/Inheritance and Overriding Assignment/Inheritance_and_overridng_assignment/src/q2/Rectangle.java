package q2;
//This line specifies that the Rectangle class belongs to the "q2" package. A package is a group of 
//related classes.
public class Rectangle {
	// The Rectangle class is defined here. This class represents a rectangle.
	double length;
	// This line declares a variable named length to store the length of the rectangle.
	double breadth;
	// This line declares a variable named breadth to store the breadth of the rectangle.
	
	public Rectangle(double length, double breadth) {
		// This is a constructor for the Rectangle class. A constructor is a special method used to initialize objects.
	    // The "public" keyword means that this constructor can be accessed from outside the class.
	    // The "Rectangle(double length, double breadth)" constructor takes two parameters: length and breadth, which represent the dimensions of the rectangle.
		this.length = length;
		 // This line assigns the value of the parameter length to the instance variable length.
		this.breadth = breadth;
		// This line assigns the value of the parameter breadth to the instance variable breadth.
	}
	
	public double calculateArea() {
		// This is a method named calculateArea. A method is a block of code that performs a specific task.
	    // The "public" keyword means that this method can be accessed from outside the class.
	    // The "double" keyword indicates that this method returns a double (a floating-point number).
	    // The "calculateArea()" method does not take any parameters.
		double Area = length * breadth;
		// This line calculates the area of the rectangle using the formula length * breadth and stores it in the variable named Area.
		return Area;
		// This line returns the calculated area.

	}

}
