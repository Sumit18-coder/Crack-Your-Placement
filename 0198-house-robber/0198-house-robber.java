/**
 --> create an dp arr & init the 1st ele with nums 1st ele & 2nd dp ele will be max among nums 1st & 2nd
 --> loop through nums & init dp[i] with max among prev ele of dp with sum of nums current ele and 
     dps prev to prev's ele.
 --> return dp length - 1
 */
class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i = 2;i < nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i] + dp[i - 2]);
        }
        return dp[nums.length - 1];
    }
}
