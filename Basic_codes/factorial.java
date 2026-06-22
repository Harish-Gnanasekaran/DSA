package Basic_codes;

public class factorial {

    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;

        if (num < 0) {
            System.out.println("Negative value is invalid");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}