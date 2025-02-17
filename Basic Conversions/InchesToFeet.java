import java.util.Scanner;

public class InchesToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in inches: ");
        double inches = scanner.nextDouble();
        double feet = inches * 0.08333;
        System.out.printf("%.2f inches is %.2f feet", inches, feet);

        scanner.close();
    }
}
