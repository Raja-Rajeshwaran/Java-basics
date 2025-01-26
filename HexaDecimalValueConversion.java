
import java.util.Scanner;

public class HexaDecimalValueConversion {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String hex = s.nextLine();
            if (hex.startsWith("0x") || hex.startsWith("0X")) {
                long decimal = Long.decode(hex);
                System.out.println(decimal);
            }
            long decimalValue = Long.parseLong(hex.substring(2), 16);
            System.out.println(decimalValue);
        }
    }
}
