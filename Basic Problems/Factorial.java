import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long factorial = 1;

        for (long val = 1; val <= num; val++) {
            factorial *= val;
        }

        System.out.printf("The Factorial of %d is %d",num,factorial);

        scanner.close();

    }
}
