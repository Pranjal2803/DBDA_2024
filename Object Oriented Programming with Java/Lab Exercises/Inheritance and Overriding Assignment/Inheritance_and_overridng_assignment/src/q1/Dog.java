package q1;
//This line specifies that the Dog class belongs to the "q1" package. A package is a group of related classes.

public class Dog extends Animal{
	// The Dog class is defined here. This class represents a dog.
	// The "extends Animal" part means that the Dog class inherits from the Animal class.
	@Override
	    // This is the overridden method named makeSound. A method is a block of code that performs a specific task.
	    
	public void makeSound() {
		// The "public" keyword means that this method can be accessed from outside the class.
	    // The "void" keyword means that this method does not return any value.
	    // The "makeSound()" method does not take any parameters.
		System.out.println("Dog makes bark sound");
		// This line prints a message to the console saying that a dog makes a "bark" sound.
	}


}
