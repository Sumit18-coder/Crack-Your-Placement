class Solution {
   public void moveZeroes(int[] nums) {

        //start first pos
        int insertPosition = 0;

        for(int i = 0; i < nums.length;i++){
            //fill all non-zeroes
            if(nums[i] != 0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while(insertPosition < nums.length){
            nums[insertPosition++] = 0;
        }
        
    }
}