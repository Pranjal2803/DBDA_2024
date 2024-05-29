package hmqquestion;
//This declares the package name. Packages are used to group related classes together.
import java.util.HashMap;
//This line tells the Java compiler to include a specific part of Java's standard library, specifically the 
//HashMap class. A HashMap is a data structure that organizes items in key-value pairs, allowing for 
//efficient retrieval, insertion, and deletion of elements. 
import java.util.Map;
//This line imports the Map interface from Java's standard library. An interface in Java is like a blueprint 
//for classes. It defines a set of methods that a class must implement if it implements that interface. 
//The Map interface represents a collection of key-value pairs.
import java.util.Scanner;
//This line imports the Scanner class from Java's standard library.The Scanner class provides methods to 
//read different types of input, making it useful for handling various user inputs.

public class HASHMAPBOOKMAIN {
	// This declares a public class named HASHMAPBOOKMAIN.
	public static void main(String[] args) {
		//This is the main method, the starting point of any Java application.
		Scanner sc = new Scanner(System.in);
		// This creates a Scanner object to read user input from the console and assigned to scanner 
		//object reference sc
		Book B1 = new Book(1,"Pr", 200, "J.K Rowling", 10, "Marvels");
		// Creates a Book object B1 with id 1, name "Pr", price 200, author "J.K Rowling", ISBN 10, 
		//and publication "Marvels".
		Book B2 = new Book(2,"Pr1", 400, "Christpoher", 20, "DC");
		// Creates a Book object B2 with id 2, name "Pr1", price 400, author "Christopher", ISBN 20, 
		//and publication "DC".
		Book B3 = new Book(3,"SH", 100, "Peter", 15, "Sherlok holmes");
		// Creates a Book object B3 with id 3, name "SH", price 100, author "Peter", ISBN 15, 
		//and publication "Sherlock Holmes".
		Book B4 = new Book(4,"Power of life", 600, "Pranjal", 10, "Life");
		// Creates a Book object B4 with id 4, name "Power of Life", price 600, author "Pranjal", ISBN 10, 
		//and publication "Life".
		Book B5 = new Book(5,"Eternity", 350, "Nancy", 12, "SK");
		// Creates a Book object B5 with id 5, name "Eternity", price 350, author "Nancy", ISBN 12, 
		//and publication "SK".
		HashMap<Integer, Book> Bhm = new HashMap<>();
		 // Creates a reference of HashMap instance i.e Bhm to store Book objects with Integer keys
		Bhm.put(1, B1);
		// Puts the Book object B1 into the HashMap with key 1.
		Bhm.put(2, B2);
		// Puts the Book object B2 into the HashMap with key 2.
		Bhm.put(3, B3);
		// Puts the Book object B3 into the HashMap with key 3.
		Bhm.put(4, B4);
		// Puts the Book object B4 into the HashMap with key 4.
		Bhm.put(5, B5);
		// Puts the Book object B5 into the HashMap with key 5.
		
		//Display all book objects which are in HashMap using for each loop
		for(Map.Entry<Integer, Book> aa:Bhm.entrySet()) {
			// This loop iterates over each entry (key-value pair) in the HashMap.
			Book b = aa.getValue();
			// Gets the Book object from the current entry in the HashMap.
			b.dispBook();
			// Calls the dispBook method to print the details of the Book object.
		}
		//Read any object using key given by user
		System.out.println("Enter the key:");
		// Asks the user to enter a key to look up a Book object.
		int No = sc.nextInt();
		// Reads the key entered by the user.
		Book j = Bhm.get(No);
		// Retrieves the Book object corresponding to the key entered by the user.
		j.dispBook();
		// Calls the dispBook method to print the details of the retrieved Book object.
		
		
		//Reduce the price of particular publication by 10% and show 
		System.out.println("How many publications price should be reduced");
		// Asks the user how many publications' prices should be reduced.
		int Num = sc.nextInt();
		// Reads the number of publications from the user.
		for(int i = 0 ;i<Num;i++) {
			// This loop runs the specified number of times.
			System.out.println("tell the publication name");
			// Asks the user to enter the name of the publication whose price should be reduced.
			String pub_name = sc.next();
			// Reads the publication name entered by the user.
			for( Map.Entry<Integer, Book> aa1:Bhm.entrySet()) {
				// This loop iterates over each entry i.e key-value pair in the HashMap.
				Book obj = aa1.getValue();
				// Gets the Book object (value) from the current entry in the HashMap.
				if(obj.publication.equals(pub_name)) {
					// Checks if the Book's publication name matches the user's input.
					obj.price = (float) (obj.price -(0.1*(obj.price)));
					// Reduces the price of the book by 10%.
					obj.dispBook();
					// Calls the dispBook method to print the details of the Book object.
					
				}
				
				
			}
		}
	}

}
