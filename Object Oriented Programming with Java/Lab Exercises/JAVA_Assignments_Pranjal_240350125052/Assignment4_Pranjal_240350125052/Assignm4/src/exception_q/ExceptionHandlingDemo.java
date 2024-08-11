package exception_q;

public class ExceptionHandlingDemo {
    // Method that throws an exception
    public static void methodThatThrows() throws Exception {
        throw new Exception("Exception thrown from methodThatThrows");
    } // This line of code creates and throws an issue from the method named "methodThatThrows" with
    //a message "Exception thrown from methodThatThrows"

    public static void main(String[] args) {
        // a) Multiple catch blocks
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } // This will cause ArrayIndexOutOfBoundsException because the array is accessed at an index that doesn't exist
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } // This catch block catches the ArrayIndexOutOfBoundsException and prints its message and "e" is 
        // the exception object  which is caught by catch block
        catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } // This catch block catches any other exceptions and prints their messages and
        //and "e" is the exception object  which is caught by catch block

        // b) try-catch-finally combination
        try {
            int result = 10 / 0;
        } // This will cause ArithmeticException because division by zero is not allowed
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } // This catch block catches the ArithmeticException and prints its message and e is the
        // and "e" is the exception object  which is caught by catch block
        finally {
            System.out.println("Finally block executed for try-catch-finally");
        } // This block always executes after the try block, regardless of whether an exception occurs or not

        // c) try-finally combination
        try {
            System.out.println("Executing try-finally block");
        } // This block of code is executed
        finally {
            System.out.println("Finally block executed for try-finally");
        } // This block always executes after the try block, even if an exception occurs or not

        // d) Nested try blocks
        try {
            try {
                methodThatThrows();
            } // This method call throws an exception
            catch (Exception e) {
                System.out.println("Exception caught in inner try block: " + e.getMessage());
             // This catch block catches the exception thrown by the method and prints its message and 
            // "e" is the exception object  which is caught by catch block      
            } 
        } // This rethrows the caught exception to be caught by the outer catch block
        catch (Exception e) {
            System.out.println("Exception caught in outer try block: " + e.getMessage());
        } // This catch block catches the rethrown exception and prints its message
    }
}
