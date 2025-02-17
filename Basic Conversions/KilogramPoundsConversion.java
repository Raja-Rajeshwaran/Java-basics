import java.util.Scanner;

public class KilogramPoundsConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms to convert to pounds: ");
        double kg = scanner.nextDouble();
        double pounds = kg * 2.20462;
        System.out.printf("%.2f Kilograms = %.2f Pounds%n", kg, pounds);

        System.out.print("Enter weight in pounds to convert to kilograms: ");
        double pound = scanner.nextDouble();
        double kilogram = pound * 0.453592;
        System.out.printf("%.2f Pounds = %.2f Kilograms%n", pound, kilogram);

        scanner.close();
    }
}
