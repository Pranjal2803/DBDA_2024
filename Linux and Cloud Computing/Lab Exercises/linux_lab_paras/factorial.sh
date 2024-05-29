# Write a shell script to find the factorial of given number using user input.
#!/bin/bash
# This is the shebang line that tells the system to use the Bash shell to interpret this script.

echo "Enter a number:"
# Prints a prompt message asking the user to enter a number.

read num
# Reads the user's input and stores it in the variable 'num'.

factorial=1
# Initializes the variable 'factorial' to 1. This variable will be used to store the result of the factorial calculation.

for ((i = 1; i <= num; i++)); do
    # Starts a for loop with the variable 'i' initialized to 1.
    # The loop continues as long as 'i' is less than or equal to 'num'.
    # After each iteration, 'i' is incremented by 1.
    
    factorial=$((factorial * i))
    # Multiplies the current value of 'factorial' by 'i' and stores the result back in 'factorial'.
    # This effectively calculates the factorial by multiplying all integers from 1 to 'num'.
done
# Ends the for loop.

echo "Factorial of $num: $factorial"
# Prints the result of the factorial calculation, showing the original number and its factorial.
