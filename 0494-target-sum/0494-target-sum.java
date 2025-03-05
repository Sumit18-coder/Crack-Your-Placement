class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return call(nums, target, 0, 0);
    }
    public int call(int[] nums, int tar, int idx, int currSum){
        if(idx == nums.length) return(currSum == tar) ? 1 : 0;

        int add = call(nums, tar, idx + 1, currSum + nums[idx]); 
        int sub = call(nums, tar, idx + 1, currSum - nums[idx]);

        return add + sub;
    }
}