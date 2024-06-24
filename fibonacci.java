import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class fibonacci {

    // Print Fibonacci numbers up to a certain value
    public static void printNthSeries(long max) {
        if (max < 1) {
            System.out.println("Error: max must be greater than 0");
            return;
        }

        long a = 1, b = 1;
        System.out.print(a);
        if (max > 1) {
            System.out.print(", " + b);
        }

        while (true) {
            long c = a + b;
            if (c > max) break;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Check if a number is a Fibonacci number
    public static boolean isFibonacci(long number, Set<Long> fibSet) {
        return fibSet.contains(number);
    }

    // Generate Fibonacci numbers up to a certain limit
    public static Set<Long> generateFibonacciSet(long limit) {
        Set<Long> fibSet = new HashSet<>();
        long a = 1, b = 1;
        fibSet.add(a);
        fibSet.add(b);
        while (true) {
            long c = a + b;
            if (c > limit) break;
            fibSet.add(c);
            a = b;
            b = c;
        }
        return fibSet;
    }

    // Main method to test the Fibonacci functions
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            long limit = 2880067194370816120L;  // 90th Fibonacci number
            Set<Long> fibSet = generateFibonacciSet(limit);

            while (true) {
                long n = -1;

                // Get a valid input from the user
                while (n < 1 || !isFibonacci(n, fibSet)) {
                    System.out.print("Please Enter a Fibonacci number up to " + limit + ": ");
                    n = input.nextLong();
                    if (n < 1) {
                        System.out.println("Error: n must be greater than 0");
                    } else if (n > limit) {
                        System.out.println("Error: n must not be greater than the 90th Fibonacci number (" + limit + ")");
                    } else if (!isFibonacci(n, fibSet)) {
                        System.out.println("Error: n must be a Fibonacci number");
                    }
                }

                // Display the Fibonacci number and the sequence up to that number
                System.out.println("The Fibonacci number is: " + n);
                System.out.print("Sequence up to " + n + " is: ");
                fibonacci.printNthSeries(n);

                // Ask the user if they want to enter another number or exit
                System.out.print("Do you want to enter another Fibonacci number? (yes/no): ");
                String response = input.next();
                if (response.equalsIgnoreCase("no")) {
                    System.out.println("Exiting the program.");
                    break;
                }
            }
        }
    }
}





