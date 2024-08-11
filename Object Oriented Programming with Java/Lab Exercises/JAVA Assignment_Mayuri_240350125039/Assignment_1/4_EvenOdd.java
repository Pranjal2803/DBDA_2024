import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");

        // Read the integer input from the user
        int num = sc.nextInt();

        // Check if the number is even or odd
        if (num % 2 == 0) {
            // If the number is divisible by 2, it is even
            System.out.println("The given number is even: " + num);
        } else {
            // If the number is not divisible by 2, it is odd
            System.out.println("The given number is odd: " + num);
        }

        // Close the Scanner object
        sc.close();
    }
}
