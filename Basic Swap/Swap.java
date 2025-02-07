
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            
            //Swap using third variable
            int temp = num1;
            num1 = num2;
            num2 = temp;
            
            System.out.println("num1=" + num1);
            System.out.println("num2=" + num2);
        }
    }
}
