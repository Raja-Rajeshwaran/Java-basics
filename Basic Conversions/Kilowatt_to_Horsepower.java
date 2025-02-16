import java.util.Scanner;

public class Kilowatt_to_Horsepower {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kilowatt, horsepower;
        kilowatt = scanner.nextDouble();
        horsepower = kilowatt * 1.35962;
        System.out.printf("%.2f Horsepower", horsepower);

        scanner.close();
        
    }
}
