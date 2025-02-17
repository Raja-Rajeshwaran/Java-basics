import java.util.Scanner;

public class DegreeToRadian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();
        double radians = degrees * (Math.PI / 180.0);
        System.out.printf("%.2f degrees is %.2f radians", degrees, radians);

        scanner.close();
    }
}
