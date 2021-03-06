package _821.Approach2;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] ans = new int[len];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < len; ++i) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = len - 1; i >= 0; --i) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}
