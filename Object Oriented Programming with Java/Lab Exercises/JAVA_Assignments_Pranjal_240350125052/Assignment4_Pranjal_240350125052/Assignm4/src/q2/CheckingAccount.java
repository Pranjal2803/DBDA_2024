package q2;
//This line declares a package named `q2`.
import java.util.Scanner;
//This line imports the `Scanner` class from the `java.util` package.

public class CheckingAccount {
	// This line declares a class named `CheckingAccount`
	int no;
	//This line declares an integer variable `no` to store the checking account number
	String ename;
	//This line declares a string variable `ename` to store the employee name
	float sal;
	// This line declares a float variable `sal` to store the salary.
	Scanner sc = new Scanner(System.in);
	// This line creates a Scanner object named `sc` for reading input.
	
	public CheckingAccount(int no, String ename, float sal) {
		// This is a constructor for the CheckingAccount class.
		super();
		//This line calls the constructor of the superclass 
		this.no = no;
		// This line assigns the value of the local variable `no` to the instance variable `no`.
		this.ename = ename;
		//This line assigns the value of the local variable `ename` to the instance variable `ename`
		this.sal = sal;
		// This line assigns the value of the local variable `sal` to the instance variable `sal`.

	}
	
	void withdraw(float WA, float sal) {
		// This method is used to withdraw money from the account.
	    try {
	    	// This line begins a try block to handle exceptions.
	        if (sal > WA) {
	        	// This line checks if the current balance is greater than the withdrawal amount.
	            sal = sal - WA;
	         // This line subtracts the withdrawal amount from the current balance.
	            System.out.println("Withdraw done and sal remaining : " + sal);
	         // This line prints a message indicating successful withdrawal and the remaining balance.  
	        } else {
	          //IF if condition is not met then control comes in this else block
	            System.out.println("Not sufficient funds");
	         // This line prints a message indicating insufficient funds if the condition is not met.
	        }
	    } catch (Exception e) {
	    	// This line begins a catch block to catch any exceptions that occur.
	        System.out.println("Handling exception in withdrawing of money");
	     // This line prints a message indicating that an exception occurred while attempting to withdraw money.
	    }
	    }
	}



