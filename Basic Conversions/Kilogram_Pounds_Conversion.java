import java.util.Scanner;

public class Kilogram_Pounds_Conversion {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kilograms to Pounds
        double kg = scanner.nextDouble();
        double pounds = kg * 2.20462;
        System.out.printf("%.2f Pounds", pounds);

        //Pounds to Kilograms
        double pound = scanner.nextDouble();
        double kilogram = pound * 0.453592;
        System.out.printf("%.2f Kilograms", kilogram);

        scanner.close();

    }
}
