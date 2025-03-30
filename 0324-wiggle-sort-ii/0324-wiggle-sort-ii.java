class Solution {
    public void wiggleSort(int[] nums) {
       int[] res = nums.clone();
       Arrays.sort(res);
       int mid = (nums.length + 1) / 2;
       int j = mid - 1;
       int k = nums.length - 1;
       for(int i = 0;i < nums.length;i++){
        if(i % 2 == 0){
            nums[i] = res[j--];
        }else{
            nums[i] = res[k--];
        }
       } 
    }
}