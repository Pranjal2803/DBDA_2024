package q2;
//This line specifies that the Cir_Rec_Sh_Tri_Main class belongs to the "q2" package. A package is a group of related classes.
public class Cir_Rec_Sh_Tri_Main {
	// The Cir_Rec_Sh_Tri_Main class is defined here. This class serves as the entry point of the program.
	public static void main(String[] args) {
		 // This is the main method. It is a special method that serves as the entry point for Java applications.
	    // The "public" keyword means that this method can be accessed from outside the class.
	    // The "static" keyword means that this method belongs to the class itself, not to instances of the class.
	    // The "void" keyword means that this method does not return any value.
	    // The "main(String[] args)" method takes an array of strings as input parameters.
		Circle C1 = new Circle(6.36);
		// Create an instance of the Circle class and assign it to a variable named C1.
        // The "new" keyword is used to create a new object (instance) of the Circle class.
        // The Circle(6.36) constructor is called to initialize the new object with a radius of 6.36.
		System.out.println(C1.calculateArea());
		// Print the area of the circle using the calculateArea() method and display it to the console.
		Rectangle R1 = new Rectangle(12.6, 10.36);
		// Create an instance of the Rectangle class and assign it to a variable named R1.
        // The "new" keyword is used to create a new object (instance) of the Rectangle class.
        // The Rectangle(12.6, 10.36) constructor is called to initialize the new object with dimensions 12.6 (length) and 10.36 (breadth).
		System.out.println(R1.calculateArea());
		// Print the area of the rectangle using the calculateArea() method and display it to the console.
		Triangle T1 = new Triangle(6.00, 9.63);
		// Create an instance of the Triangle class and assign it to a variable named T1.
        // The "new" keyword is used to create a new object (instance) of the Triangle class.
        // The Triangle(6.00, 9.63) constructor is called to initialize the new object with a base of 6.00 and a height of 9.63.
		System.out.println(T1.calculateArea());
		// Print the area of the triangle using the calculateArea() method and display it to the console.
	}

}
