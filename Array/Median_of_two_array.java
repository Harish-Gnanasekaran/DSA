package Array;
import java.util.Arrays;
public class Median_of_two_array {

        public double medianOf2(int a[], int b[]) {
            // Code Here


            int[] arr = new int[a.length + b.length];

            int k = 0;

            for (int i = 0; i < a.length; i++) {
                arr[k++] = a[i];
            }

            for (int i = 0; i < b.length; i++) {
                arr[k++] = b[i];
            }

            Arrays.sort(arr);

            int n = arr.length;

            if (n % 2 == 0) {
                return (arr[n / 2] + arr[(n / 2) - 1]) / 2.0;
            }

            return arr[n / 2];
        }
    }

