import java.util.Scanner;

public class TotalDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of days: ");
        long totalDays = scanner.nextLong();
        scanner.close();

        long years = totalDays / 365;
        long remainingDays = totalDays % 365;
        long weeks = remainingDays / 7;
        long days = remainingDays % 7;

        System.out.printf("Years: %d%nWeeks: %d%nDays: %d%n", years, weeks, days);
    }
}
