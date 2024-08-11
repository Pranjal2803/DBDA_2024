package q5;
//This line specifies that the CheckingAccount class belongs to the "q5" package. A package is a group of related classes.

public class CheckingAccount extends Account {
	// The CheckingAccount class is defined here. This class extends the Account class, meaning it inherits properties and methods from Account.
    public double overdraftLimit;
 // This line declares a variable named overdraftLimit to store the overdraft limit.

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        // This is a constructor for the CheckingAccount class. A constructor is a special method used to initialize objects.
        // The "CheckingAccount(String accountNumber, double balance, double overdraftLimit)" constructor takes three parameters: accountNumber, balance, and overdraftLimit.
        super(accountNumber, balance);
     // This line calls the constructor of the superclass (Account) to initialize accountNumber and balance.
        this.overdraftLimit = overdraftLimit;
     // This line assigns the value of the parameter overdraftLimit to the instance variable overdraftLimit.
    }

    @Override
 // This method overrides the abstract withdraw method in the Account class.
    public void withdraw(double amount) {
    	// The "public" keyword means that this method can be accessed from outside the class.
        // The "void" keyword indicates that this method does not return any value.
        // The "double amount" parameter represents the amount to be withdrawn.
        if (balance + overdraftLimit >= amount) {
        	// This line checks if the balance plus overdraft limit is greater than or equal to the amount to be withdrawn.
            balance -= amount;
         // If sufficient funds are available, this line deducts the amount from the balance.
            System.out.println("Withdrawal of $" + amount + " successful.");
         // This line prints a success message.
        } else {
            System.out.println("Insufficient funds.");
         // If insufficient funds, this line prints an error message.
        }
    }

    @Override
 // This method overrides the abstract calculateInterest method in the Account class.
    public void calculateInterest() {
    	 // The "public" keyword means that this method can be accessed from outside the class.
        // The "void" keyword indicates that this method does not return any value.
        System.out.println("No interest for checking accounts.");
     // This line prints a message indicating no interest is calculated for checking accounts.
    }
}
