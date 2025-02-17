import java.util.Scanner;

public class DateChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (dd/mm/yyyy): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("/");
        if (parts.length != 3) {
            System.out.println("Invalid date format");
            return;
        }

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (isValidDate(day, month, year)) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Adjust for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
