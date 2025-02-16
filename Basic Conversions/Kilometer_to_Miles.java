import java.util.Scanner;

public class Kilometer_to_Miles {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double km = scanner.nextDouble();
        double miles = km / 1.6;
        System.out.printf("%.2f Miles", miles);

        scanner.close();
        
    }
}
