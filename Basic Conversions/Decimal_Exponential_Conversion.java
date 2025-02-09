import java.util.Scanner;

public class Decimal_Exponential_Conversion {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {

            double d = s.nextDouble();
            System.out.printf("%e%n", d);

        }
    }
}
