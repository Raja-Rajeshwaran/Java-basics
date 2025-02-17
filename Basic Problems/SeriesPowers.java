import java.util.Scanner;

public class SeriesPowers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        long powerOfTwo = 1, powerOfThree = 1;

        System.out.println("Series of Powers (2 and 3) up to N:");

        for (long i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                System.out.printf("2^%d = %-10d", (i+1)/2, powerOfTwo);
                powerOfTwo *= 2;
            } else {
                System.out.printf("3^%d = %-10d", i/2, powerOfThree);
                powerOfThree *= 3;
            }
            System.out.println(); // Moves to the next line for better clarity
        }
    }
}
