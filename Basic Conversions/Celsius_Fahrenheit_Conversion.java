import java.util.Scanner;

public class Celsius_Fahrenheit_Conversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Celsius to Fahrenheit
        double celsius = scanner.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.printf("%.2fF Fahrenheit", fahrenheit);

        //Fahrenheit to Celsius
        double fahrenheit2 = scanner.nextDouble();
         double celsius2 = (fahrenheit2 - 32) * 5 / 9;
        System.out.printf("%.2f Celsius", celsius2);
        
        scanner.close();
        
    }
}
