package com.conversion;

import java.util.Scanner;

public class Decimal_Exponential_Conversion {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            // Decimal to Exponential
            double d = s.nextDouble();
            System.out.printf("%e%n", d);

            // Exponential to Decimal
            String str = s.next();
            System.out.println(Double.parseDouble(str));

        }
    }
}
