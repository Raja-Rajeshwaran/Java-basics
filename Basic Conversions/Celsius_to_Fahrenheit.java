import java.util.Scanner;

public class Celsius_to_Fahrenheit {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double celsius = scanner.nextDouble();
            double fahrenheit = ((celsius * 9) / 5) + 32;
            System.out.printf("%.2fF%n", fahrenheit);

        }
    }
}
