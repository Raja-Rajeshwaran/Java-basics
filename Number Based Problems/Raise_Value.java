import java.util.Scanner;

public class Raise_Value {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long pow = scanner.nextLong();
        long ans = 1;

        for (int ctr = 1; ctr <= pow; ctr++) {
            ans *= num;
        }

        System.out.println(ans);

        scanner.close();
        
    }
}
