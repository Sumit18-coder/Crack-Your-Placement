/**
 --> create an dp arr & init the 1st ele with nums 1st ele & 2nd dp ele will be max among nums 1st & 2nd
 --> loop through nums & init dp[i] with max among prev ele of dp with sum of nums current ele and 
     dps prev to prev's ele.
 --> return dp length - 1
 */
class Solution {
    public int rob(int[] nums) {
        int prev2 = 0; 
        int prev1 = 0; 

        for(int num : nums){
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
