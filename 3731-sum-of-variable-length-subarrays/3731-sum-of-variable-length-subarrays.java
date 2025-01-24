class Solution {
    public int subarraySum(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            int j = i - nums[i] - 1;
            nums[i] += nums[i - 1];
            res += nums[i] - (j < 0 ? 0 : nums[j]);
        }
        return res;
    }
}