package Amazon.Arrays;

public class OneAndZero {

    public static int getCount(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String s : strs) {
            int zeros = 0, ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
                else ones++;
            }

            // Traverse backwards to avoid recomputation
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zeros][j - ones]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String[] arr = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        System.out.println(getCount(arr, m, n)); // Output: 4
    }
}
