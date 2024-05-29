#!/bin/bash

# Prompt the user to enter a value
echo "Enter a value:"

# Read the user input and store it in the 'value' variable
read value

# Start of the case statement
case $value in
    1)
        echo "one"
        ;;
    2)
        echo "two"
        ;;
    3)
        echo "three"
        ;;
    *)
        echo "Out of choice"
        ;;
esac
#Prompt and Input: Asks the user to enter a value and reads the input.
#case Statement: Checks the value entered by the user against different cases.
#If the value is 1, it prints "one".
#If the value is 2, it prints "two".
#If the value is 3, it prints "three".
#If the value doesn't match any of the above cases (*), it prints "Out of choice".
#This script provides a simple way to handle different cases based on user input.