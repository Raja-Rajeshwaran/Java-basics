import java.util.Scanner;

public class BasicPrintFormats {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Escape sequence demonstration
        System.out.println("Success is when your \"signature\" becomes \"autograph\"");

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();

        // Print up to 2 decimals
        System.out.printf("Rounded to 2 decimals: %.2f%n", decimal);

        // Print with 20 width space
        System.out.printf("With 20-width space: %20.4f%n", decimal);

        // Print with user-defined width
        System.out.print("Enter the number of decimal places to display: ");
        int i = sc.nextInt();
        System.out.printf("With %d decimal places: %." + i + "f%n", i, decimal);

        // Print rounded value
        System.out.println("Rounded value: " + Math.round(decimal));

        sc.close();
    }
}
