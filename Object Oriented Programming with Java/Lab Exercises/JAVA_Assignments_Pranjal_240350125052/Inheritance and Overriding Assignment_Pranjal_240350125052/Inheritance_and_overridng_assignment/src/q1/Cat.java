package q1;
//This line specifies that the Cat class belongs to the "q1" package. A package is a group of related classes.
public class Cat extends Animal{
	// The Cat class is defined here. This class represents a cat.
	// The "extends Animal" part means that the Cat class inherits from the Animal class.
	@Override
	// This is the overridden method named makeSound. A method is a block of code that performs a specific task.
	public void makeSound(){
		 // The "public" keyword means that this method can be accessed from outside the class.
	    // The "void" keyword means that this method does not return any value.
	    // The "makeSound()" method does not take any parameters.
		System.out.println("Cat makes meow sound");
		// This line prints a message to the console saying that a cat makes a "meow" sound.
	}

}
