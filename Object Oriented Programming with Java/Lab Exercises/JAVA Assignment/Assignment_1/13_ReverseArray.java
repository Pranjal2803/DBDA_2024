import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Original array
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length;

        // Create a new array to store the reversed elements
        int[] reverseArray = new int[length];

        // Iterate through the original array and assign values to the reversed array
        for (int i = 0; i < length; i++) {
            reverseArray[i] = arr[length - i - 1];
        }

        // Print the original and reversed arrays
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray));
    }
}

