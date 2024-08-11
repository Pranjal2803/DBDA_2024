public class Triangle {
    public static void main(String[] args) {
        // Number of rows for the triangle
        int rows = 5;

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Inner loop to print the asterisks in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

