import java.util.Scanner;

public class KilometerToMiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers to convert to miles: ");
        double km = scanner.nextDouble();
        double miles = km / 1.6;
        System.out.printf("%.2f Kilometers = %.2f Miles%n", km, miles);

        scanner.close();
    }
}
