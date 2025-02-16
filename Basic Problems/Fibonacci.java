import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of terms in the Fibonacci sequence

        if (n <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            return;
        }

        long f1 = 1, f2 = 1;
        
        if (n == 1) {
            System.out.println(f1);
        } else {
            System.out.print(f1 + " " + f2);
            for (int i = 3; i <= n; i++) {
                long f3 = f1 + f2;
                System.out.print(" " + f3);
                f1 = f2;
                f2 = f3;
            }
        }

        scanner.close();
        
    }
}
