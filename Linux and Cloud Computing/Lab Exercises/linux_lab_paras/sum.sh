# Write a shell script for the addition, subtraction, multiplication & divsion of two numbers using user input.
#!/bin/bash
# This is the shebang line that tells the system to use the Bash shell to interpret this script.

echo "Enter two numbers:"
# Prints a prompt message asking the user to enter two numbers.

read num1
# Reads the first number entered by the user and stores it in the variable 'num1'.

read num2
# Reads the second number entered by the user and stores it in the variable 'num2'.

sum=$((num1 + num2))
# Calculates the sum of 'num1' and 'num2' using arithmetic expansion and stores the result in the variable 'sum'.

echo "Sum: $sum"
# Prints the result of the addition.

sub=$((num1 - num2))
# Calculates the difference by subtracting 'num2' from 'num1' and stores the result in the variable 'sub'.

echo "Sub: $sub"
# Prints the result of the subtraction.

mul=$((num1 * num2))
# Calculates the product of 'num1' and 'num2' and stores the result in the variable 'mul'.

echo "Mul: $mul"
# Prints the result of the multiplication.

div=$((num1 / num2))
# Calculates the quotient by dividing 'num1' by 'num2' and stores the result in the variable 'div'.
# Note: This performs integer division.

echo "Div: $div"
# Prints the result of the division.
