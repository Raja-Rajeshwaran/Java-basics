import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a triangular number: ");
        int input = scanner.nextInt();

        int num = 1;
        while ((num * (num + 1)) / 2 < input) {
            num++;
        }

        if ((num * (num + 1)) / 2 == input) {
            System.out.println(input + " is a Triangular Number at position: " + num);
        } else {
            System.out.println(input + " is NOT a Triangular Number.");
        }

        scanner.close();
    }
}
