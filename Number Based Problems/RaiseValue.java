import java.util.Scanner;

public class RaiseValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        long num = scanner.nextLong();

        System.out.print("Enter the exponent: ");
        long pow = scanner.nextLong();

        long result = (long) Math.pow(num, pow);

        System.out.println("The result of " + num + " raised to the power " + pow + " is: " + result);

        scanner.close();
    }
}
