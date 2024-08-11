package q5;
//This line specifies that the Account class belongs to the "q5" package. A package is a group of related classes.
public abstract class Account {
	// The Account class is defined here. This class is abstract, meaning it cannot be instantiated directly and must be subclassed.
    public String accountNumber;
 // This line declares a variable named accountNumber to store the account number.
    public double balance;
 // This line declares a variable named balance to store the balance of the account.



    public Account(String accountNumber, double balance) {
    	// This is a constructor for the Account class. A constructor is a special method used to initialize objects.
        // The "Account(String accountNumber, double balance)" constructor takes two parameters: accountNumber and balance, which represent the account number and initial balance.
        this.accountNumber = accountNumber;
     // This line assigns the value of the parameter accountNumber to the instance variable accountNumber.
        this.balance = balance;
     // This line assigns the value of the parameter balance to the instance variable balance.
    }

    public void deposit(double amount) {
    	// This method allows a deposit to the account.
        // The "public" keyword means that this method can be accessed from outside the class.
        // The "void" keyword indicates that this method does not return any value.
        // The "double amount" parameter represents the amount to be deposited.
        balance += amount;
     // This line adds the deposit amount to the balance.
    }

    public abstract void withdraw(double amount);
 // This is an abstract method named withdraw. An abstract method does not have a body and must be implemented by subclasses.
    // The "abstract" keyword indicates that this method must be implemented in subclasses.
    // The "double amount" parameter represents the amount to be withdrawn.
 
    public abstract void calculateInterest();
 // This is an abstract method named calculateInterest. An abstract method does not have a body and must be implemented by subclasses.
    // The "abstract" keyword indicates that this method must be implemented in subclasses.

    public void display() {
    	// This method displays the account details.
        // The "public" keyword means that this method can be accessed from outside the class.
        // The "void" keyword indicates that this method does not return any value.

        System.out.println("Account Number: " + accountNumber);
     // This line prints the account number.
        System.out.println("Balance: $" + balance);
     // This line prints the balance.
    }
}
