# Write a shell script to check the number is even or not using if else statement.
#!/bin/bash

# Prompt the user to enter a number
echo "Enter a number:"

# Read the user input and store it in the 'num' variable
read num

# Assign 10 to the variable 'add' (there is a mistake here, 'add=10' would be more appropriate)
add=$num
add=10

# Check if the number is even or odd using if-else statement
if [ $((num % 2)) -eq 0 ]; then
    # If the remainder of the division of the number by 2 is 0, then it is even
    echo "EVEN"
else
    # If the remainder is not 0, then it is odd
    echo "ODD"
fi
