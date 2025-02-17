import java.util.Scanner;

public class IntegerCharacterConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to convert to a character: ");
        int asciiValue = sc.nextInt();
        char characterFromInt = (char) asciiValue;
        System.out.printf("Integer: %d -> Character: %c%n", asciiValue, characterFromInt);

        System.out.print("Enter a character to convert to an integer: ");
        char charInput = sc.next().charAt(0);
        int asciiFromChar = charInput;
        System.out.printf("Character: %c -> Integer: %d%n", charInput, asciiFromChar);

        sc.close();
    }
}
