class Solution {

    public int numDecodings(String s) {
        int n = s.length();
        int res = solve(s, n);
        return res;
    }

    public int solve(String s, int n) {
        int[] t = new int[n + 1];

        Arrays.fill(t, 0);
        t[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                t[i] = 0;
            } else {
                t[i] = t[i + 1];
                if (i < n - 1 && (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7'))) {
                    t[i] += t[i + 2];
                }
            }
        }
        return t[0];
    }

}