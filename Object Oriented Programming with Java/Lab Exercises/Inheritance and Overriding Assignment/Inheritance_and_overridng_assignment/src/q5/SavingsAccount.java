package q5;
//This line specifies that the SavingsAccount class belongs to the "q5" package. A package is a group of related classes.
public class SavingsAccount extends Account {
// The SavingsAccount class is defined here. This class extends the Account class, meaning it inherits properties and methods from Account.

    public double interestRate;
 // This line declares a variable named interestRate to store the interest rate.

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
    	// This is a constructor for the SavingsAccount class. A constructor is a special method used to initialize objects.
        // The "SavingsAccount(String accountNumber, double balance, double interestRate)" constructor takes three parameters: accountNumber, balance, and interestRate.

        super(accountNumber, balance);
        // This line calls the constructor of the superclass (Account) to initialize accountNumber and balance.
        this.interestRate = interestRate;
     // This line assigns the value of the parameter interestRate to the instance variable interestRate.
    }

    @Override
 // This method overrides the abstract withdraw method in the Account class.
    public void withdraw(double amount) {
    	// The "public" keyword means that this method can be accessed from outside the class.
        // The "void" keyword indicates that this method does not return any value.
        // The "double amount" parameter represents the amount to be withdrawn.
        if (balance >= amount) {
        	 // This line checks if the balance is greater than or equal to the amount to be withdrawn.
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
        double interest = balance * interestRate / 100;
     // This line calculates the interest based on the balance and interest rate.
        balance += interest;
     // This line adds the calculated interest to the balance.
        System.out.println("Interest calculated and added to the account: $" + interest);
     // This line prints a message with the calculated interest.
    }
}