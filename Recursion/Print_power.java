package Recursion;

import java.util.ArrayList;

public class Print_power {
    public ArrayList<Integer> pattern(int n) {
            ArrayList<Integer> ans = new ArrayList<>();
            solve(n, n, false, ans);
            return ans;
        }

        void solve(int curr, int original, boolean increase, ArrayList<Integer> ans) {
            ans.add(curr);

            if (curr <= 0)
                increase = true;

            if (increase) {
                if (curr == original)
                    return;
                solve(curr + 5, original, true, ans);
            } else {
                solve(curr - 5, original, false, ans);
            }
        }
    }

