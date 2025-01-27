
import java.util.Scanner;

public class Without_Trailing_Zeros {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {

            // Float to String
            float f = s.nextFloat();
            System.out.println(String.valueOf(f));

            // String to Float
            double floatValue = s.nextDouble();
            String stringValue = Double.toString(floatValue);
            String formattedValue = stringValue.replaceAll("\\\\.?0*$", "");
            System.out.println(formattedValue);

        }

    }
}
