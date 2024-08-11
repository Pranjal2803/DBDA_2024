
public class AccMain {

    public static void main(String[] args) {
        // Create an instance of the Account class
        Account ac1 = new Account();

        // Call the readAcc method to read account details from the user
        ac1.readAcc();

        // Call the Withdraw method to withdraw an amount from the account
        ac1.Withdraw(15000);

        // Call the Deposit method to deposit an amount into the account
        ac1.Deposit(1000);

        // Call the interest method to calculate and display the interest
        ac1.interest(6, 2);
    }

}
