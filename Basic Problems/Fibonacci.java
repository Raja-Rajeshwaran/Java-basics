import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of terms in the Fibonacci sequence
        
        if (n <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            return;
        }

        // Using iterative approach
        System.out.print("Using Iterative Method: ");
        fibonacciIterative(n);

        // Using recursive approach
        System.out.print("\nUsing Recursive Method: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        // Using memoization
        System.out.print("\nUsing Memoization: ");
        long[] memo = new long[n + 1];
        fibonacciMemoization(n, memo);

        // Using matrix exponentiation
        System.out.print("\nUsing Matrix Exponentiation: ");
        fibonacciMatrix(n);
        
        scanner.close();
    }

    // Iterative method to generate Fibonacci numbers
    public static void fibonacciIterative(int n) {
        long f1 = 1, f2 = 1;
        if (n == 1) {
            System.out.print(f1);
        } else {
            System.out.print(f1 + " " + f2);
            for (int i = 3; i <= n; i++) {
                long f3 = f1 + f2;
                System.out.print(" " + f3);
                f1 = f2;
                f2 = f3;
            }
        }
        System.out.println();
    }

    // Recursive method to generate nth Fibonacci number
    public static long fibonacciRecursive(int n) {
        if (n <= 2) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Memoization method
    public static void fibonacciMemoization(int n, long[] memo) {
        for (int i = 1; i <= n; i++) {
            if (i <= 2) memo[i] = 1;
            else memo[i] = memo[i - 1] + memo[i - 2];
            System.out.print(memo[i] + " ");
        }
        System.out.println();
    }

    // Matrix Exponentiation method for Fibonacci number
    public static void fibonacciMatrix(int n) {
        long[][] result = {{1, 0}, {0, 1}};
        long[][] fibMatrix = {{1, 1}, {1, 0}};
        
        power(fibMatrix, n - 1, result);
        
        System.out.println(result[0][0]);
    }

    // Matrix multiplication helper method
    public static void multiply(long[][] a, long[][] b, long[][] res) {
        int row1 = a.length, col1 = a[0].length, row2 = b.length, col2 = b[0].length;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                res[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    // Matrix exponentiation method
    public static void power(long[][] fibMatrix, int n, long[][] result) {
        if (n == 0) return;
        long[][] temp = new long[2][2];
        power(fibMatrix, n / 2, result);
        multiply(result, result, temp);
        if (n % 2 != 0) multiply(temp, fibMatrix, result);
        else copyMatrix(temp, result);
    }

    // Copy matrix helper method
    public static void copyMatrix(long[][] from, long[][] to) {
        for (int i = 0; i < from.length; i++) {
            for (int j = 0; j < from[i].length; j++) {
                to[i][j] = from[i][j];
            }
        }
    }
}
