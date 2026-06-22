package Basic_codes;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input:");
        int in = input.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i <= in; i++) {
            sum = sum + a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("the sum of fibo for " + in + " is " + sum);
    }
}
