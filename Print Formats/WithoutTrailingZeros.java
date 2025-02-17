import java.util.Scanner;

public class WithoutTrailingZeros {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Input a float and remove trailing zeros
        System.out.print("Enter a float value: ");
        float f = s.nextFloat();
        System.out.println("Without trailing zeros: " + String.format("%s", f));

        // Input a double and format it without trailing zeros
        System.out.print("Enter another double value: ");
        double floatValue = s.nextDouble();
        String formattedValue = String.valueOf(floatValue).replaceAll("\\.?0*$", "");
        System.out.println("Formatted without trailing zeros: " + formattedValue);

        s.close();
    }
}
