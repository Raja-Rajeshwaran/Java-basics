package conversion;
import java.util.Scanner;

public class Integer_Character_Conversion {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Character to Integer
            int Ascii1 = sc.nextInt();
            char character1 = (char) Ascii1;
            System.out.println(Ascii1 + " : " + character1);

            // Integer to Character
            char character2 = sc.next().charAt(0);
            int Ascii2 = character2;
            System.out.println(character2 + " : " + Ascii2);
        }
    }
}
