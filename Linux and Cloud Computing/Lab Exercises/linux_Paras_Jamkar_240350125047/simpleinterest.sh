# Write a shell script to calculate the simple interest and ask the user to give p,r t as an input.
#!/bin/bash
echo "Enter principal amount:"
read principal
echo "Enter rate of interest (in %):"
read rate
echo "Enter time:"
read time
interest=$(echo "scale=2; $principal * $rate * $time / 100" | bc)
echo "Simple interest: $interest"
