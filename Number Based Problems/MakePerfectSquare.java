import java.util.Scanner;

public class MakePerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int factor = 2;
        int divide = 1;

        while (num != 1) {
            int count = 0;
            while (num % factor == 0) {
                num /= factor;
                count++;
            }
            if (count % 2 == 1) {
                divide *= factor;
            }
            factor++;
        }

        System.out.println("The smallest multiplier to make it a perfect square is: " + divide);
    }
}
