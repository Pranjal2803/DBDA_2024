import java.util.Scanner;
public class ReverseNumber {

public static void main(String[] args)
	{

        // Create a Scanner object to read input
	Scanner sc = new Scanner(System.in);
	
        // Prompt the user to enter a number        
        System.out.println("Enter a number to reverse");
	int num =sc.nextInt();
        int reversednum =0;

        // Loop until the number becomes 0
	while(num!=0){
		{
            // Extract the last digit of the number
		int digit =num%10;
  
           // Append the digit to the reversed number
	        reversednum = reversednum*10+digit;
 
           // Remove the last digit from the number
		num/=10;
		}
	
        // Print the reversed number after the loop completes	
	System.out.println("Reversed number:" +reversednum);

        // Close the Scanner object
	sc.close();
	}
	}
}