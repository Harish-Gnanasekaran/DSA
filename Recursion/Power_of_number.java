package Recursion;

class Power_of_number {
    public int reverseExponentiation(int n) {

        int rev = 0;


        int temp = n;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }


        long result = 1;
        for (int i = 0; i < rev; i++) {
            result *= n;
        }

        return (int) result;
    }
}

