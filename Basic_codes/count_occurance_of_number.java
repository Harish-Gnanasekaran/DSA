package Basic_codes;

import java.util.Scanner;

public class count_occurance_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int in = input.nextInt();

        System.out.println("Enter the counting number:");
        int counting_num = input.nextInt();

        int count = 0;
        int temp = in;   // backup copy

        while (temp > 0) {
            int rem = temp % 10;
            if (rem == counting_num) {
                count++;
            }
            temp = temp / 10;
        }

        System.out.println("The number of " + counting_num +
                " present in " + in + " is " + count);

        input.close();
    }
}