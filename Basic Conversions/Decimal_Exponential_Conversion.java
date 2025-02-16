import java.util.Scanner;

public class Decimal_Exponential_Conversion {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double d = s.nextDouble();
        System.out.printf("%e%n", d);

        s.close();
        
    }
}
