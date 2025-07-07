class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;
                for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int x = 2; i >= x * x; x++) {
                dp[i] = (Math.min(dp[i], 1 + dp[i - x * x]));
            }}        return dp[n];}}