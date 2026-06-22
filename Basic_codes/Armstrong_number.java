package Basic_codes;

public class Armstrong_number {

    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is NOT Armstrong number");
        }
    }
}