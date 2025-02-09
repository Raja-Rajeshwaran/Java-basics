import java.util.Scanner;

public class Inches_to_Feet {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double inches, feet;
            inches = scanner.nextDouble();
            feet = inches * 0.08333;
            System.out.printf("%.2f Feet", feet);

        }
    }
}

