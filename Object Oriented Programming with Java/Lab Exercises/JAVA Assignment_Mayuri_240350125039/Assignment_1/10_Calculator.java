import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        // Perform the arithmetic operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Exit the program
        }

        // Print the result
        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);

        // Close the Scanner object
        scanner.close();
    }
}


