import java.util.Scanner;

public class LitreToGallon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter volume in litres to convert to gallons: ");
        double litre = scanner.nextDouble();
        double gallon = litre * 0.26417;
        System.out.printf("%.2f Litres = %.2f Gallons%n", litre, gallon);

        scanner.close();
    }
}
