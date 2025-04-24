class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = nums.length,end = 0;
        int maxTillNow = nums[0];

        for(int i = 1;i < nums.length;i++){
            if(nums[i] >= maxTillNow){
                maxTillNow = nums[i];
            }else{
                end = i;
            }
        }
        int minTillNow = nums[nums.length - 1];
        for(int i = nums.length - 2;i >= 0;i--){
            if(nums[i] <= minTillNow){
                minTillNow = nums[i];
            }else{
                start = i;
            }
        }
        return end > start ? end - start + 1 : 0;
    }
}
/** 2 pointers
1.initialize pointers & initialize max from left.
2.first pass: left to right.
3.initialize min from right.
4.second pass: right to left.
5.if array sorted return 0 else end - start + 1.
 */