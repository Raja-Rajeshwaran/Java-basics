import java.util.Scanner;

public class PowerOf2Check {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        scanner.close();

        System.out.println("Using Bitwise AND: " + isPowerOfTwoBitwise(num));
        System.out.println("Using Logarithm: " + isPowerOfTwoLogarithmic(num));
        System.out.println("Using Iterative Division: " + isPowerOfTwoIterative(num));
        System.out.println("Using Integer Comparison: " + isPowerOfTwoIntegerComparison(num));
        System.out.println("Using Predefined Set of Powers of 2: " + isPowerOfTwoSet(num));
        System.out.println("Using Shift Operator: " + isPowerOfTwoShift(num));
        System.out.println("Using String Length: " + isPowerOfTwoString(num));
    }

    // Method 1: Bitwise AND method
    public static String isPowerOfTwoBitwise(long num) {
        return (num > 0 && (num & (num - 1)) == 0) ? "YES" : "NO";
    }

    // Method 2: Logarithmic method
    public static String isPowerOfTwoLogarithmic(long num) {
        return (Math.log(num) / Math.log(2) % 1 == 0) ? "YES" : "NO";
    }

    // Method 3: Iterative Division
    public static String isPowerOfTwoIterative(long num) {
        while (num > 1) {
            if (num % 2 != 0) {
                return "NO";
            }
            num /= 2;
        }
        return num == 1 ? "YES" : "NO";
    }

    // Method 4: Integer Comparison
    public static String isPowerOfTwoIntegerComparison(long num) {
        long power = 1;
        while (power < num) {
            power *= 2;
        }
        return power == num ? "YES" : "NO";
    }

    // Method 5: Predefined Set of Powers of 2
    public static String isPowerOfTwoSet(long num) {
        long power = 1;
        for (int i = 0; i < 64; i++) {
            if (power == num) {
                return "YES";
            }
            power *= 2;
        }
        return "NO";
    }

    // Method 6: Using Shift Operator
    public static String isPowerOfTwoShift(long num) {
        while (num > 1) {
            if (num % 2 != 0) {
                return "NO";
            }
            num >>= 1;
        }
        return num == 1 ? "YES" : "NO";
    }

    // Method 7: Using String Length
    public static String isPowerOfTwoString(long num) {
        return Integer.toBinaryString((int) num).replace("0", "").length() == 1 ? "YES" : "NO";
    }
}
