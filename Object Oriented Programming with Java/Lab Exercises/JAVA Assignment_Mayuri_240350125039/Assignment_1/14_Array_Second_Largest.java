public class ArrayLargestExample {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {10, 35, 69, 89, 26};

        // Initialize max as the first element of the array
        int max = arr[0];

        // Initialize secondmax to the smallest possible integer value
        int secondmax = Integer.MIN_VALUE;

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                // If the current element is greater than max,
                // update secondmax with the value of max and max with the current element
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max) {
                // If the current element is greater than secondmax (but not equal to max),
                // update secondmax with the value of the current element
                secondmax = arr[i];
            }
        }

        // Print the second largest element
        System.out.println("The second largest element is: " + secondmax);
    }
}

