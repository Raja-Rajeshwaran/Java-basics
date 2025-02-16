import java.util.Scanner;

public class Degree_to_Radian {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double degree = scanner.nextDouble();
        double radian = degree * (Math.PI / 180.0);
        System.out.printf("%.2f Radians", radian);

        scanner.close();
            
    }
}
