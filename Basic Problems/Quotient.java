import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divi = scanner.nextInt();
        
        scanner.close();

        int quotient = num / divi;

        System.out.println("The quotient of " + num + " divided by " + divi + " is: " + quotient);
    }
}
