package q5;
//This line specifies that the Main class belongs to the "q5" package. A package is a group of related classes.
public class Main {
	// The Main class is defined here. 
    public static void main(String[] args) {
    	//This class contains the main method, which is the entry point of the program.
        Account savingsAccount = new SavingsAccount("SA123", 1000, 5);
     // Creating a new SavingsAccount object with account number "SA123", balance of 1000, and interest rate of 5%
        Account checkingAccount = new CheckingAccount("CA456", 2000, 500); 
     // Creating a new CheckingAccount object with account number "CA456", balance of 2000, and overdraft limit of $500

     // Printing initial account details
        System.out.println("Initial account details:");
        System.out.println("Savings Account:");
        savingsAccount.display();
     // Displaying details of the savings account
        System.out.println("\nChecking Account:");
        checkingAccount.display();
     // Displaying details of the checking account

        // Perform transactions
        System.out.println("\nPerforming transactions:");
        savingsAccount.deposit(500);
     // Depositing $500 into the savings account
        savingsAccount.display();
     // Displaying details of the savings account after deposit
        savingsAccount.withdraw(200);
     // Withdrawing $200 from the savings account
        savingsAccount.display();
     // Displaying details of the savings account after withdrawal
        savingsAccount.calculateInterest();
     // Calculating interest for the savings account
        savingsAccount.display();
     // Displaying details of the savings account after interest calculation

        checkingAccount.deposit(1000);
     // Depositing $1000 into the checking account
        checkingAccount.display();
     // Displaying details of the checking account after deposit
        checkingAccount.withdraw(2500); 
     // Attempting to withdraw $2500 from the checking account (more than balance + overdraft limit)
        checkingAccount.display();
     // Displaying details of the checking account after the failed withdrawal
        checkingAccount.withdraw(1500); 
     // Withdrawing $1500 from the checking account (within the overdraft limit)
        checkingAccount.display();
     // Displaying details of the checking account after withdrawal

    }
}