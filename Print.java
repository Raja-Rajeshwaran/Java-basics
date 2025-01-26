
import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Success is when your \"signature\" becomes \"autograph\"");
          double decimal = sc.nextDouble();
          System.out.printf("%.2f", decimal);
          System.out.printf("%20.4f\n", decimal);
          int i = sc.nextInt();
          System.out.printf("%." + i + "f", decimal);
          System.out.println(Math.round(decimal));
        }
    }
}
