#!/bin/bash
# This is the shebang line that tells the system to use the Bash shell to interpret this script.

# Function to calculate the area of a circle
calculate_circle_area() {
    echo "Enter the radius of the circle:"
    # Prompts the user to enter the radius of the circle.
    
    read radius
    # Reads the user's input and stores it in the variable 'radius'.
    
    area=$(echo "scale=2; 3.14 * $radius * $radius" | bc)
    # Calculates the area of the circle using the formula πr^2.
    # 'scale=2' sets the precision to 2 decimal places.
    # 'bc' is used for the floating-point arithmetic.
    
    echo "Area of the circle with radius $radius is: $area"
    # Prints the calculated area of the circle.
}

# Function to calculate the perimeter of a circle
calculate_circle_perimeter() {
    echo "Enter the radius of the circle:"
    # Prompts the user to enter the radius of the circle.
    
    read radius
    # Reads the user's input and stores it in the variable 'radius'.
    
    perimeter=$(echo "scale=2; 2 * 3.14 * $radius" | bc)
    # Calculates the perimeter of the circle using the formula 2πr.
    # 'scale=2' sets the precision to 2 decimal places.
    # 'bc' is used for the floating-point arithmetic.
    
    echo "Perimeter of the circle with radius $radius is: $perimeter"
    # Prints the calculated perimeter of the circle.
}

# Function to calculate the area of a square
calculate_square_area() {
    echo "Enter the side length of the square:"
    # Prompts the user to enter the side length of the square.
    
    read side
    # Reads the user's input and stores it in the variable 'side'.
    
    area=$(echo "$side * $side" | bc)
    # Calculates the area of the square using the formula side^2.
    # 'bc' is used for the arithmetic.
    
    echo "Area of the square with side length $side is: $area"
    # Prints the calculated area of the square.
}

# Function to calculate the perimeter of a square
calculate_square_perimeter() {
    echo "Enter the side length of the square:"
    # Prompts the user to enter the side length of the square.
    
    read side
    # Reads the user's input and stores it in the variable 'side'.
    
    perimeter=$(echo "4 * $side" | bc)
    # Calculates the perimeter of the square using the formula 4 * side.
    # 'bc' is used for the arithmetic.
    
    echo "Perimeter of the square with side length $side is: $perimeter"
    # Prints the calculated perimeter of the square.
}

# Function to calculate the area of a rectangle
calculate_rectangle_area() {
    echo "Enter the length of the rectangle:"
    # Prompts the user to enter the length of the rectangle.
    
    read length
    # Reads the user's input and stores it in the variable 'length'.
    
    echo "Enter the width of the rectangle:"
    # Prompts the user to enter the width of the rectangle.
    
    read width
    # Reads the user's input and stores it in the variable 'width'.
    
    area=$(echo "$length * $width" | bc)
    # Calculates the area of the rectangle using the formula length * width.
    # 'bc' is used for the arithmetic.
    
    echo "Area of the rectangle with length $length and width $width is: $area"
    # Prints the calculated area of the rectangle.
}

# Function to calculate the perimeter of a rectangle
calculate_rectangle_perimeter() {
    echo "Enter the length of the rectangle:"
    # Prompts the user to enter the length of the rectangle.
    
    read length
    # Reads the user's input and stores it in the variable 'length'.
    
    echo "Enter the width of the rectangle:"
    # Prompts the user to enter the width of the rectangle.
    
    read width
    # Reads the user's input and stores it in the variable 'width'.
    
    perimeter=$(echo "2 * ($length + $width)" | bc)
    # Calculates the perimeter of the rectangle using the formula 2 * (length + width).
    # 'bc' is used for the arithmetic.
    
    echo "Perimeter of the rectangle with length $length and width $width is: $perimeter"
    # Prints the calculated perimeter of the rectangle.
}

# Main menu
while true; do
    # Starts an infinite loop to display the menu and process user choices.

    echo "Choose a shape to calculate its area and perimeter:"
    # Prints the main menu prompt.

    echo "1. Circle"
    echo "2. Square"
    echo "3. Rectangle"
    echo "4. Exit"
    # Prints the menu options.

    read choice
    # Reads the user's menu choice and stores it in the variable 'choice'.

    case $choice in
        1)
            calculate_circle_area
            # Calls the function to calculate the area of a circle.
            
            calculate_circle_perimeter
            # Calls the function to calculate the perimeter of a circle.
            ;;
        2)
            calculate_square_area
            # Calls the function to calculate the area of a square.
            
            calculate_square_perimeter
            # Calls the function to calculate the perimeter of a square.
            ;;
        3)
            calculate_rectangle_area
            # Calls the function to calculate the area of a rectangle.
            
            calculate_rectangle_perimeter
            # Calls the function to calculate the perimeter of a rectangle.
            ;;
        4)
            echo "Exiting program..."
            # Prints an exit message.
            
            exit 0
            # Exits the script with a status of 0 (success).
            ;;
        *)
            echo "Invalid choice. Please enter a number between 1 and 4."
            # Prints an error message for invalid menu choices.
            ;;
    esac
    # Ends the case statement.
done
# Ends the while loop.
# Run the chmod command to make the script executable:
# chmod +x shape_calculator.sh
# Run the script with the following command
# ./shape_calculator.sh

