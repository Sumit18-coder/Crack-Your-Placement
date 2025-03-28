class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int absdiff = 0;
        if(nums.length <= 1){
            return 0;
        }
        for(int i = 0;i < nums.length - 1;i++){
           int gap = nums[i + 1] - nums[i];
           absdiff = Math.max(gap,absdiff);          
        }
        return absdiff;
    }
}