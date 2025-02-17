import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a perfect cube: ");
        long number = scanner.nextLong();

        long cubeRoot = Math.round(Math.cbrt(number));

        if (cubeRoot * cubeRoot * cubeRoot == number) {
            System.out.println(number + " is a Perfect Cube.");
        } else {
            System.out.println(number + " is NOT a Perfect Cube.");
        }

        scanner.close();
    }
}
