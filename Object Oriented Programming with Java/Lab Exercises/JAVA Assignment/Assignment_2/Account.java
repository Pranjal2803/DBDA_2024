import java.util.Scanner;

public class Account {
    // Instance variables
    int accno;
    String accname;
    float amt;

    // Constructor
    public Account() {
        // Initialize instance variables (but there's a logical issue here, see explanation)
        this.accno = accno;
        this.accname = accname;
        this.amt = amt;
    }

    // Method to read account details
    public void readAcc() {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read account number
        System.out.println("Enter Account Number");
        accno = sc.nextInt();

        // Read account name
        System.out.println("Enter Name");
        accname = sc.next();

        // Read amount
        System.out.println("Enter Amount");
        amt = sc.nextFloat();
    }

    // Method to withdraw money
    public void Withdraw(float withdrawamt) {
        if (withdrawamt > 0 && withdrawamt <= amt) {
            // If withdrawal amount is valid, deduct from balance
            amt -= withdrawamt;
            System.out.println(withdrawamt + " Withdrawn Succ




