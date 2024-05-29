public class MaxMin {
    public int max(int[] array) {
        int max = array[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int min(int[] array) {
        int min = array[0];

        // Loop through the array to find the minimum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String args[]) {
        // Define the array
        int[] myArray = {23, 92, 93, 39, 93};
        
        // Create an instance of the MaxMin class
        MaxMin m = new MaxMin();
        
        // Call the max and min methods and print the results
        System.out.println("Maximum value in the array is: " + m.max(myArray));
        System.out.println("Minimum value in the array is: " + m.min(myArray));
    }
}
