import java.util.Scanner;

public class M3 {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            long num1 = scanner.nextLong();
            long num2 = scanner.nextLong();
            long num3 = scanner.nextLong();
            long max = Math.max(Math.max(num1, num2), num3);
            long min = Math.min(Math.min(num1, num2), num3);
            long mid = num1 + num2 + num3 - max - min;
            System.out.printf("%d < %d < %d", min, mid, max);
            
        }
    }
}

