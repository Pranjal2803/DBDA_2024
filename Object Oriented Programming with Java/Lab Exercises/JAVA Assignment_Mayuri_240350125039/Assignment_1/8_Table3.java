
public class Table3 {
    public static void main(String[] args) {
        // Define the number for which the multiplication table will be printed
        int num = 5;
        
        // Define the size of the multiplication table
        int tableSize = 10;

        // Loop to iterate through the table size
        for (int i = 1; i <= tableSize; i++) {
            // Print the multiplication result using printf for formatted output
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
    }
}