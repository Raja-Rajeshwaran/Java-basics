import java.util.Scanner;

public class KilowattToHorsepower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter power in kilowatts to convert to horsepower: ");
        double kilowatt = scanner.nextDouble();
        double horsepower = kilowatt * 1.35962;
        System.out.printf("%.2f Kilowatts = %.2f Horsepower%n", kilowatt, horsepower);

        scanner.close();
    }
}
