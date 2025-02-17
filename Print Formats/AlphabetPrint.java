import java.util.Scanner;

public class AlphabetPrint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of repetitions: ");
        long repetitions = scanner.nextLong();

        for (long i = 1; i <= repetitions; i++) {
            for (char alpha = 'a'; alpha <= 'z'; alpha++) {
                System.out.print(alpha + " ");
            }
            System.out.println(); // Move to the next line after printing the alphabet
        }

        scanner.close();
    }
}
