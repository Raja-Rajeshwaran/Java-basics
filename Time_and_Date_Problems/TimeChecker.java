import java.util.Scanner;

public class TimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in HH:mm:ss format: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isValidTime(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }

    public static boolean isValidTime(String input) {
        String[] parts = input.split(":");
        if (parts.length != 3) {
            return false;
        }

        try {
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
