import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        long multiple = scanner.nextLong();
        long sum = 0;

        for (long value = 1; value <= multiple; value++) {
            sum = number + sum;
        }

        System.out.println(sum);

        scanner.close();
    }
}
