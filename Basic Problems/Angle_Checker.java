import java.util.Scanner;

public class Angle_Checker {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int angle1 = scanner.nextInt();
            int angle2 = scanner.nextInt();
            int angle3 = scanner.nextInt();

            if ((angle1 + angle2 + angle3 == 180) && angle1 != 0 && angle2 != 0 && angle3 != 0) {
                System.out.println("Valid");
            } else {
                System.out.println("Not Valid");
            }
            
        }
    }
}

