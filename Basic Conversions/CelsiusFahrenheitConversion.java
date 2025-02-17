import java.util.Scanner;

public class CelsiusFahrenheitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit2 = scanner.nextDouble();
        double celsius2 = (fahrenheit2 - 32) * 5 / 9;
        System.out.printf("%.2f Fahrenheit is %.2f Celsius", fahrenheit2, celsius2);

        scanner.close();
    }
}
