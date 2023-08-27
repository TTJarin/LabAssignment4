package problem8_17;

import java.util.Scanner;

public class NumericRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x :");
        double x = scanner.nextDouble();

        System.out.println("Enter the value of n :");
        int n = scanner.nextInt();

        System.out.println("The numeric value is : " + Numeric.intPower(x,n));
    }
}
