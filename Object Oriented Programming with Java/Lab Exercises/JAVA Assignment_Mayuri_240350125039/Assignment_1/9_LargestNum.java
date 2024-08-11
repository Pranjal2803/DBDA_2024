import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        // Prompt the user to enter the third number
        System.out.println("Enter the third number:");
        double num3 = sc.nextDouble();

        // Initialize largenum with the first number
        double largenum = num1;

        // Compare the second number with largenum
        if (num2 > largenum) {
            largenum = num2;
        }

        // Compare the third number with largenum
        if (num3 > largenum) {
            largenum = num3;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largenum);

        // Close the Scanner object
        sc.close();
    }
}


