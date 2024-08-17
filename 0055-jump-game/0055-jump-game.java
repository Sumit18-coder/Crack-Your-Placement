class Solution {
    public boolean canJump(int[] nums) {
        //initially final position is the last index
        int finalPosition = nums.length - 1;

        //start from the second last index
        for(int idx = nums.length - 2;idx >= 0; idx--){
            //if you can reach to the final position from this index
            //update the final position flag
            if(idx + nums[idx] >= finalPosition){
                finalPosition = idx;
            }
        }
        //if we reach the first index,then we can make the jump possible 
        return finalPosition == 0;
    }
}