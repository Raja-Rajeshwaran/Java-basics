import java.util.Scanner;

public class FactorialTrailingZeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long zero = 0;

        while (num > 0) {
            zero += num / 5;
            num /= 5;
        }

        scanner.close();

        System.out.println(zero);
    }
}
