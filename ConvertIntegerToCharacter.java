import java.util.*;
public class ConvertIntegerToCharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int Ascii= sc.nextInt();
            char character= (char)Ascii; 
            System.out.println(Ascii+":"+character);
        }
    }
}