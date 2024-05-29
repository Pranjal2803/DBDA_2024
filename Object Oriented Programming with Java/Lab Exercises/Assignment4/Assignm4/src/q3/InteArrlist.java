package q3;
//Declares a package named `q3`.

import java.util.ArrayList;
//Imports the ArrayList class from java.util package.
import java.util.Collections;
//Imports the Collections class from java.util package.
public class InteArrlist {
	// Declares a public class named `InteArrlist`.
	public static void main(String[] args) {
		// Declares the main method, the entry point of the program.
		ArrayList<Integer> II = new ArrayList<>();
		// Creates an ArrayList named `II` to store integers.
		System.out.println("Add element to arraylist");
		// Prints a message indicating adding elements to the ArrayList.
		II.add(600);
		// Adds 600 to the ArrayList.
		II.add(20);
		// Adds 20 to the ArrayList.
		II.add(30);
		// Adds 30 to the ArrayList.
		System.out.println("Elements added to arraylist");
		// Prints a message "Elements added to arraylist"
		
		System.out.println();
		// Prints a blank line.
		System.out.println("Removing a element");
		// Prints a message indicating the removal of an element.
		II.remove(2);
		// Removes the element at index 2 from the ArrayList.
		System.out.println("Element removed");
		// Prints a message confirming the element has been removed.
		System.out.println();
		// Prints a blank line
		System.out.println("Modifying a integer");
		// Prints a message indicating modification of an integer.
		II.set(1,9000);
		// Modifies the element at index 1 to 9000.
		System.out.println();
		// Prints a blank line.
		System.out.println("Printing elements using iterator");
		// Prints a message indicating printing elements using an iterator.
		for( Integer a:II) {
		// Iterates over each element in the ArrayList.
			System.out.println(a);
			// Prints each element in the arraylist using for-loop
		}
		

		
		System.out.println("Sorting the integers");
		// Prints a message indicating sorting the integers.
		Collections.sort(II);
		// Sorts the elements in the ArrayList.
		for(int i=0;i<2;i++) {
			// Iterates over the first two elements in the sorted ArrayList.
			int I = II.get(i);
			// Retrieves the element at index `i` from arraylist and stores it into varaible I 
			System.out.println(I);
			// Prints the element.
		}
		
	}

}
