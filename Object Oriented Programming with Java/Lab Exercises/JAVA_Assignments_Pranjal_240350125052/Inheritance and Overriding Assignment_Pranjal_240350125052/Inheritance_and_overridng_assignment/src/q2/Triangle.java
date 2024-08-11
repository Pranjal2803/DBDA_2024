package q2;
//This line specifies that the Triangle class belongs to the "q2" package. A package is a group of related classes.
public class Triangle {
	// The Triangle class is defined here. This class represents a triangle.
	double base;
	// This line declares a variable named base to store the length of the base of the triangle.
	double height;
	// This line declares a variable named height to store the height of the triangle.

	
	public Triangle(double base, double height) {
		// This is a constructor for the Triangle class. A constructor is a special method used to initialize objects.
	    // The "public" keyword means that this constructor can be accessed from outside the class.
	    // The "Triangle(double base, double height)" constructor takes two parameters: base and height, which represent the dimensions of the triangle.
		this.base = base;
		// This line assigns the value of the parameter base to the instance variable base.
		this.height = height;
		// This line assigns the value of the parameter height to the instance variable height.

	}
	

	double calculateArea(){
		// This is a method named calculateArea. A method is a block of code that performs a specific task.
		// The "double" keyword indicates that this method returns a double (a floating-point number).
	    // The "calculateArea()" method does not take any parameters.
		double Area = 0.5*base*height;
		// This line calculates the area of the triangle using the formula 0.5 * base * height and stores it in the variable named Area.
		return Area;
		// This line returns the calculated area.
		
	}
}
