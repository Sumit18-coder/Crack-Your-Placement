class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0;i < n;i++){
            if(nums[i] == nums[i+1]){
                ans = nums[i];
            }
        }
    return ans;
    }
}