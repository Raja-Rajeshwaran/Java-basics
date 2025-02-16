import java.util.Scanner;

public class Descending4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n1 = scanner.nextLong();
        long n2 = scanner.nextLong();
        long n3 = scanner.nextLong();
        long n4 = scanner.nextLong();

        long max1 = Math.max(Math.max(n1, n2), Math.max(n3, n4));
        long min1 = Math.min(Math.min(n1, n2), Math.min(n3, n4));
        long min2 = Math.min(Math.max(n1, n2), Math.max(n3, n4));
        long max2 = Math.max(Math.min(n1, n2), Math.min(n3, n4));
        
        if (max2 < min2) {
            long temp = max2;
            max2 = min2;
            min2 = temp;
        }
        System.out.printf("%d > %d > %d > %d", max1, max2, min2, min1);
        
        scanner.close();
        
    }
}

