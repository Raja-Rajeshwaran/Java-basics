import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Time_Checker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setLenient(false);
        scanner.close();

        try {

            int hours = Integer.parseInt(input.split(":")[0]);
            int minutes = Integer.parseInt(input.split(":")[1]);
            int seconds = Integer.parseInt(input.split(":")[2]);
            
            if (hours >= 0 && hours <= 24 && minutes >= 0 && minutes <=60 && seconds >=0 && seconds <=60 ) {
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

