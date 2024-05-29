# Write a shell script to calculate the factorial of a given number using recursion.
#!/bin/bash


factorial() {
    if [ $1 -eq 0 ] || [ $1 -eq 1 ]; then
        echo 1
    else
        local next_factorial=$(factorial $(( $1 - 1 )))
        echo $(( $1 * $next_factorial ))
    fi
}

##### main function
echo "Enter a number to calculate its factorial:"
read number

final_result=$(factorial $number)
echo "The factorial of $number is: $final_result"

