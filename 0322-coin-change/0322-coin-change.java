class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = dpfunc(0,coins,amount,dp,n);
        if(ans == Integer.MAX_VALUE-1) return -1;
        return ans;
    }
        public int dpfunc(int ind, int[] coins, int amount, int[][] dp, int n){
        if(ind== n && amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE-1;
        if(ind == n) return Integer.MAX_VALUE-1;

        if(dp[ind][amount] != -1) return dp[ind][amount]; 

        dp[ind][amount] = Math.min(1+dpfunc(ind,coins,amount-coins[ind],dp,n),dpfunc(ind+1,coins,amount,dp,n));
        return dp[ind][amount];
    }
}