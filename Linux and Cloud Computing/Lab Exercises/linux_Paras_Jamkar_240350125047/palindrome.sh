# Check whether a number is palindrome or not.
#!/bin/bash

# Prompt the user to enter a number
echo "Enter a number:"

# Read the user input and store it in the 'num' variable
read num

# Initialize variables for reverse and temporary storage
reverse=0
temp=$num

# Loop to reverse the number
while [ $temp -gt 0 ]; do
    digit=$((temp % 10))
    reverse=$((reverse * 10 + digit))
    temp=$((temp / 10))
done

# Check if the original number is equal to its reverse
if [ $num -eq $reverse ]; then
    echo "$num is a palindrome number."
else
    echo "$num is not a palindrome number."
fi

