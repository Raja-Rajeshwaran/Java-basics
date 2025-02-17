import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        swapUsingThirdVariable(num1, num2);
        swapUsingAdditionAndSubtraction(num1, num2);
        swapUsingMultiplicationAndDivision(num1, num2);
        swapUsingXOR(num1, num2);

        scanner.close();
    }

    static void swapUsingThirdVariable(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Using third variable: num1=" + num1 + ", num2=" + num2);
    }

    static void swapUsingAdditionAndSubtraction(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Using addition/subtraction: num1=" + num1 + ", num2=" + num2);
    }

    static void swapUsingMultiplicationAndDivision(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            num1 = num1 * num2;
            num2 = num1 / num2;
            num1 = num1 / num2;
            System.out.println("Using multiplication/division: num1=" + num1 + ", num2=" + num2);
        } else {
            System.out.println("Cannot use multiplication/division for zero values.");
        }
    }

    static void swapUsingXOR(int num1, int num2) {
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Using XOR: num1=" + num1 + ", num2=" + num2);
    }
}
