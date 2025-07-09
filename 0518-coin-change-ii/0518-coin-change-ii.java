class Solution {
    int[][] memo;
    int n;

    public int numberOfWays(int[] coins, int i, int amount) {
        if (amount == 0) {
            return 1;
        }
        if (i == n || amount < 0) {
            return 0;
        }
        if (memo[i][amount] != -1) {
            return memo[i][amount];
        }
        if (coins[i] > amount) {
            return memo[i][amount] = numberOfWays(coins, i + 1, amount);
        }
        int take = numberOfWays(coins, i, amount - coins[i]);
        int skip = numberOfWays(coins, i + 1, amount);
        return memo[i][amount] = take + skip;
    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }
}
