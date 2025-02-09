import java.util.Scanner;

public class Squarefeet_to_Acres {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            double squareFeet = scanner.nextDouble();
            double acres = squareFeet / 43560.0;
            System.out.printf("%.2f Acres", acres);

        }
    }
}
