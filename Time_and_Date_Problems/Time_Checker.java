import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Time_Checker {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            sdf.setLenient(false);
            try {
                int hours = Integer.parseInt(input.split(":")[0]);
                if (hours >= 0 && hours <= 24) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Not Valid");
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("Not Valid");
            }

        }
    }
}

