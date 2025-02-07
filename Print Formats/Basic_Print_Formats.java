
import java.util.Scanner;

public class Basic_Print_Formats {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Escape sequence \"
            System.out.print("Success is when your \"signature\" becomes \"autograph\"");

            // Print up to 2 decimals
            double decimal = sc.nextDouble();
            System.out.printf("%.2f", decimal);

            // Print with 20 width space 
            System.out.printf("%20.4f\n", decimal);

            // Print with desired width space
            int i = sc.nextInt();
            System.out.printf("%." + i + "f", decimal);
            System.out.println(Math.round(decimal));

        }
    }
}
