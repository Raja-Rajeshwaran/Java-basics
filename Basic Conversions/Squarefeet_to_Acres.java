import java.util.Scanner;

public class Squarefeet_to_Acres {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double squareFeet = scanner.nextDouble();
        double acres = squareFeet / 43560.0;
        System.out.printf("%.2f Acres", acres);
        
        scanner.close();
        
    }
}
