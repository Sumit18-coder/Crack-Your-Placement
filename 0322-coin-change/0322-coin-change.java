class Solution {
    public int coinChange(int[] coins, int amount) {
     if(amount < 1) return 0;
     //create a dp
     int[] minCoinsDp = new int[amount + 1];
     for(int i = 1;i <= amount; i++){
        minCoinsDp[i] = Integer.MAX_VALUE;
        for(int coin : coins)
            if(coin <= i && minCoinsDp[i - coin] != Integer.MAX_VALUE)
               minCoinsDp[i] = Math.min(minCoinsDp[i],1 + minCoinsDp[i - coin]); 
     } 
     if(minCoinsDp[amount] == Integer.MAX_VALUE)
        return -1;
     return minCoinsDp[amount];
    }
}