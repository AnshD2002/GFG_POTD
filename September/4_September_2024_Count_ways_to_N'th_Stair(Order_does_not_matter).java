class Solution {
    public long nthStair (int n) {
        if(n == 0 || n == 1) return 1;
        long[] dp= new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i <= n; i++){
            dp[i]=dp[i-2] + 1;
        }
    return dp[n];
    }
}
