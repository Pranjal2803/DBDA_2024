package q2;
//This line specifies that the shape class belongs to the "q2" package. 
//A package is a group of related classes.
abstract class shape {
// The shape class is defined here. This class is declared as abstract, meaning it cannot be instantiated 
//directly.
	abstract double calculateArea();
	// The "abstract" keyword means that this method does not have a body and must be implemented by subclasses.
    // The "double" keyword indicates that this method returns a double (a floating-point number).
    // The "calculateArea()" method does not take any parameters.

}
