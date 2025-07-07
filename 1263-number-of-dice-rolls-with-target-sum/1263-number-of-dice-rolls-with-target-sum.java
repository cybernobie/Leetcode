class Solution {
    int mod = (int) (1e9 + 7);

    public int numRollsToTarget(int n, int k, int target) {
        Integer[][] record = new Integer[n + 1][target + 1];
        return numRollsToTarget(n, k, target, record);
    }

    public int numRollsToTarget(int n, int k, int target, Integer[][] record) {
        int res = 0;
        if (n == 0)
            return target == 0 ? 1 : 0;

        if (target < 0)
            return 0;

        if (record[n][target] != null)
            return record[n][target];

        for (int i = 1; i <= k; i++)
            res = (res + numRollsToTarget(n - 1, k, target - i, record)) % mod;
        return record[n][target] = res;
    }
}