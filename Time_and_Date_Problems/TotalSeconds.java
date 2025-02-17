import java.util.Scanner;

public class TotalSeconds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total seconds: ");
        int totalSeconds = scanner.nextInt();
        scanner.close();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.printf("%02d:HOURS %02d:MIN %02d:SEC%n", hours, minutes, seconds);
    }
}
