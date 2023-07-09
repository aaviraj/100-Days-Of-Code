import java.util.*;
class Solution {
    public int numOfWays(int n) {
        int mod = (int)Math.pow(10, 9) + 7;
        long[][] dp = new long[n][2];
        Arrays.fill(dp[0], 6);
        for (int i = 1; i < n; i++) {
            dp[i][0] = (dp[i - 1][0] * 3 + dp[i - 1][1] * 2) % mod;
            dp[i][1] = (dp[i - 1][0] * 2 + dp[i - 1][1] * 2) % mod;
        }
        return (int)((dp[n -1][0] + dp[n - 1][1]) % mod);
    }
}