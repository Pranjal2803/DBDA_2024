package q1;
//This line specifies that the TestingMain class belongs to the "q1" package. A package is a group of related classes.

public class TestingMain {
	// The TestingMain class is defined here. This class serves as the entry point of the program.
	public static void main(String[] args) {
	// This is the main method. It is a special method that serves as the entry point for Java applications.
    // The "public" keyword means that this method can be accessed from outside the class.
    // The "static" keyword means that this method belongs to the class itself, not to instances of the class.
    // The "void" keyword means that this method does not return any value.
    // The "main(String[] args)" method takes an array of strings as input parameters.
		 Animal A1 = new Animal();
		// Create an instance of the Animal class and assign it to a variable named A1.
	    // The "new" keyword is used to create a new object (instance) of the Animal class.
        // The Animal() constructor is called to initialize the new object.
		 A1.makeSound();
		// Call the makeSound() method on the A1 object to make the animal sound.
		 Dog D1 = new Dog();
		// Create an instance of the Dog class and assign it to a variable named D1.
	    // The "new" keyword is used to create a new object (instance) of the Dog class.
	    // The Dog() constructor is called to initialize the new object.
		 D1.makeSound();
		// Call the makeSound() method on the D1 object to make the dog sound.
		 Cat C1 = new Cat();
		// Create an instance of the Cat class and assign it to a variable named C1.
	    // The "new" keyword is used to create a new object (instance) of the Cat class.
	    // The Cat() constructor is called to initialize the new object.
		 C1.makeSound();
		// Call the makeSound() method on the C1 object to make the cat sound.
		
	}

}
