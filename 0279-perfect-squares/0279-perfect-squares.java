class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1;i <= n; ++i){
            int minVal = Integer.MAX_VALUE;
            for(int j = 1; j * j <= i; ++j){
                minVal = Math.min(minVal,dp[i - j * j] + 1);
            }
            dp[i] = minVal;
        }
        return dp[n];
    }
}