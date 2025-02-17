import java.util.Scanner;

public class SquareFeetToAcres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter area in square feet to convert to acres: ");
        double squareFeet = scanner.nextDouble();
        double acres = squareFeet / 43560.0;
        System.out.printf("%.2f Square Feet = %.2f Acres%n", squareFeet, acres);

        scanner.close();
    }
}
