package hmqquestion;
//This declares the package name. Packages are used to group related classes together.
public class Book {
	// This declares a public class named Book. Classes are blueprints for creating objects.
	int id;
	// This declares an integer variable named id to store the book's ID.
	String name;
	// This declares a string variable named name to store the book's name.
	float price;
	// This declares a float variable named price to store the book's price.
	String Author_name;
	// This declares a string variable named Author_name to store the author's name.
	int isbn_no;
	// This declares an integer variable named isbn_no to store the book's ISBN number.
	String publication;
	// This declares a string variable named publication to store the book's publication name.
	
	
	public Book(int id,String name, float price, String Author_name, int isbn_no, String publication) {
	// This is a constructor method. It initializes a new instance of the Book class with the specified values.
		super();
		// This calls the constructor of the superclass. 
		this.id = id;
		// This assigns the value of the local variable id to the class variable id.
		this.name = name;
		// This assigns the value of the local variable name to the class variable name.
		this.price = price;
		// This assigns the value of the local variable price to the class variable price.
		this.Author_name = Author_name;
		// This assigns the value of the local variable Author_name to the class variable Author_name.
		this.isbn_no = isbn_no;
		// This assigns the value of the local variable isbn_no to the class variable isbn_no.
		this.publication = publication;
		// This assigns the value of the local variable publication to the class variable publication.
	}
	
	public void dispBook() {
		// This declares a public method named dispBook. It will display the book's details.
		System.out.println(id+ " "+name+" "+price+ " "+ Author_name + " "+isbn_no+ " "+publication + " ");
		// This prints the book's id, name, price, author's name, ISBN number, and publication to the console.
	}
	
	

}
