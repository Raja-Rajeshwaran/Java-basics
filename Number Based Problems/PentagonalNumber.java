import java.util.Scanner;

public class PentagonalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a pentagonal number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPentagonal(num)) {
            System.out.println(num + " is a Pentagonal Number.");
        } else {
            System.out.println(num + " is NOT a Pentagonal Number.");
        }
    }

    private static boolean isPentagonal(int num) {
        if (num <= 0) return false;
        double n = (1 + Math.sqrt(24 * num + 1)) / 6;
        return n == (int) n;
    }
}
