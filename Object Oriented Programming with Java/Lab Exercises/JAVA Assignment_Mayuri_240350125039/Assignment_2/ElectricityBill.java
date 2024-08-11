import java.util.Scanner;

public class ElectricityBill {
    int customerNumber;
    String customerName;
    int unitsConsumed;

    // Method to read customer data from user input
    public void readData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer number: ");
        customerNumber = sc.nextInt();

        System.out.println("Enter customer name: ");
        customerName = sc.next();

        System.out.println("Enter units consumed by customer: ");
        unitsConsumed = sc.nextInt();
    }

    // Method to display customer data
    public void showData() {
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
    }

    // Method to compute electricity bill based on units consumed
    public double computeBill() {
        double bill = 0.0;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 1.20;
        } else if (unitsConsumed <= 300) {
            bill = 100 * 1.20 + (unitsConsumed - 100) * 2.00;
        } else if (unitsConsumed <= 600) {
            bill = 100 * 1.20 + 200 * 2.00 + (unitsConsumed - 300) * 3.00;
        } else {
            bill = 100 * 1.20 + 200 * 2.00 + 300 * 3.00 + (unitsConsumed - 600) * 5.00;
        }
        return bill;
    }

    public static void main(String[] args) {
        // Create an instance of the ElectricityBill class
        ElectricityBill ebill = new ElectricityBill();

        // Read customer data
        ebill.readData();

        // Display customer data
        ebill.showData();

        // Compute and display electricity bill
        double bill = ebill.computeBill();
        System.out.println("Electricity Bill: Rs " + bill);
    }

}

