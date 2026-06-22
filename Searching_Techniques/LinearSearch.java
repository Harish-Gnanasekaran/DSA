package Searching_Techniques;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 32, 56, 76, 31, 45, 3};
        int target = 56;

        int start = 0;
        int last = 4;

        int ans = linearsearch(arr, target, start, last);
        System.out.println(ans);
    }

    public static int linearsearch(int[] arr, int target, int start, int last) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= last; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}