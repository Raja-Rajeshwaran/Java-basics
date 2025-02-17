import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        
        if (num < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
            return;
        }

        // Using iterative method
        System.out.printf("Factorial using Iterative method: %d\n", factorialIterative(num));

        // Using recursive method
        System.out.printf("Factorial using Recursive method: %d\n", factorialRecursive(num));

        // Using memoization method
        System.out.printf("Factorial using Memoization method: %d\n", factorialMemoization(num));

        // Using tail recursion method
        System.out.printf("Factorial using Tail Recursion method: %d\n", factorialTailRecursive(num, 1));

        scanner.close();
    }

    // Iterative method to calculate factorial
    public static long factorialIterative(long n) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long factorialRecursive(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Memoization method (uses array to store previously computed factorials)
    public static long factorialMemoization(long n) {
        long[] memo = new long[(int) (n + 1)];
        return factorialMemoHelper(n, memo);
    }

    public static long factorialMemoHelper(long n, long[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[(int) n] != 0) {
            return memo[(int) n];
        }
        memo[(int) n] = n * factorialMemoHelper(n - 1, memo);
        return memo[(int) n];
    }

    // Tail Recursion method
    public static long factorialTailRecursive(long n, long accumulator) {
        if (n == 0 || n == 1) {
            return accumulator;
        }
        return factorialTailRecursive(n - 1, n * accumulator);
    }
}
