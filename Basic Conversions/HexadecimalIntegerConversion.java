import java.util.Scanner;

public class HexadecimalIntegerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number (e.g., 0x1A): ");
        String hex = scanner.nextLine();
        if (hex.startsWith("0x") || hex.startsWith("0X")) {
            long decimalValue = Long.decode(hex);
            System.out.println("Decimal value: " + decimalValue);
        }

        System.out.print("Enter a decimal number: ");
        long decimal = scanner.nextLong();
        String hexValue = Long.toHexString(decimal);
        System.out.println("Hexadecimal value: 0x" + hexValue);

        scanner.close();
    }
}
