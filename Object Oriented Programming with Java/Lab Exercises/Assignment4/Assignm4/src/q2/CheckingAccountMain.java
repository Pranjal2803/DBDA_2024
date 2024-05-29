package q2;
//This line declares a package named q2. Packages are used to organize related classes.
public class CheckingAccountMain {
	// This line declares a public class named CheckingAccountMain. Classes are blueprints for creating objects.
	public static void main(String[] args) {
		// This line declares the main method, the starting point of any Java application.
		CheckingAccount c1 = new CheckingAccount(1001, "Pranjal", 20000);
		// This line creates a new CheckingAccount object named c1 with an account number of 1001, an 
		//employee name of "Pranjal", and an initial balance of 20000.
		c1.withdraw(2000000, 20000);
        //// This line calls the withdraw method on the c1 object, attempting to withdraw 2000000 from 
		//the account with an initial balance of 20000.
	}
}
