import java.util.Scanner;

public class DecimalExponentialConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.printf("Exponential form: %e%n", decimal);

        scanner.close();
    }
}
