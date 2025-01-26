
import java.util.*;

public class ConvertCharacterToInteger {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char character = sc.next().charAt(0);
            int ASCIIvalue = character;
            System.out.println(character + ":" + ASCIIvalue);
            sc.close();
        }
    }
}
