import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a perfect square: ");
        long number = scanner.nextLong();

        long root = (long) Math.sqrt(number);

        if (root * root == number) {
            System.out.println(number + " is a Perfect Square.");
        } else {
            System.out.println(number + " is NOT a Perfect Square.");
        }

        scanner.close();
    }
}
