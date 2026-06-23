package Basic_codes;

import java.util.Scanner;

public class prime_number_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number: ");
            int n = input.nextInt();
            if (n == 0) {
                System.out.println("Program ends");
                break;


            }


            boolean ans = isprime(n);
            System.out.println(ans);
        }


    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        } else {
            int i;
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
