public class SumArray {
    public static void main(String[] args) {
        // Define the array
        int[] array = {1, 2, 3, 4, 15};
        
        // Initialize the sum variable
        int sum = 0;
        
        // Loop through the array and calculate the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // Print the sum
        System.out.println("Sum of the array: " + sum);
    }
}

