import java.util.Scanner;

public class Litre_to_Gallon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double litre, gallon;
        litre = scanner.nextDouble();
        gallon = litre * 0.26417;
        System.out.printf("%.2f Gallons", gallon);

        scanner.close();
        
    }
}
