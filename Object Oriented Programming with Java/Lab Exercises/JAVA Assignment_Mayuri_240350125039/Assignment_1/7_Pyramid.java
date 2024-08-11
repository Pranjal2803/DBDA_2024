public class Pyramid {
    public static void main(String[] args) {
        // Number of rows for the pyramid
        int rows = 5;

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
