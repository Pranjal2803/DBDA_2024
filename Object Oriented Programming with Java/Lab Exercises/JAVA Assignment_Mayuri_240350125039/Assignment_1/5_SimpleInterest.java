import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.println("Enter principal amount: ");
        double principal = sc.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.println("Enter rate of interest: ");
        double rate = sc.nextDouble();

        // Prompt the user to enter the time period
        System.out.println("Enter time period in years: ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        // Close the Scanner object
        sc.close();
    }
}
