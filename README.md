# FibonacciSequencer
This Java program allows users to enter a Fibonacci number up to the 90th Fibonacci number and displays the sequence up to that number. The program ensures that the user inputs a valid Fibonacci number within the specified range.

Features:

- Validates user input to ensure it is a positive Fibonacci number.
- Limits the input to numbers up to the 90th Fibonacci number (2880067194370816120).
- Displays the sequence of Fibonacci numbers up to the user-specified number.
- Allows users to enter multiple numbers consecutively or exit the program.

Running the Program:

javac Fibonacci.java

java Fibonacci

Program Execution:

- The program prompts the user to enter a Fibonacci number up to 2880067194370816120.
- If the user enters a number less than 1, the program displays an error message and prompts for input again.
- If the user enters a number greater than 2880067194370816120, the program displays an error message and prompts for input again.
- If the user enters a number that is not a Fibonacci number, the program displays an error message and prompts for input again.
- Once a valid Fibonacci number is entered, the program displays the number and the sequence of Fibonacci numbers up to that number.
- The user is then asked if they want to enter another number or exit the program.

Key Methods:

printNthSeries: Prints the Fibonacci sequence up to the specified number.
isFibonacci: Checks if a given number is a Fibonacci number.
generateFibonacciSet: Generates a set of Fibonacci numbers up to a specified limit.
main: The main method that handles user interaction, input validation, and displays the results.

Notes:

The limit for the Fibonacci sequence in this program is set to the 90th Fibonacci number to avoid potential issues with larger values.
The program uses a HashSet to store and quickly validate Fibonacci numbers.

License:
This program is open-source and free to use. Modify and distribute it as needed.

