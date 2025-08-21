class Solution {
    public void sortColors(int[] nums) {
       int start = 0,mid = 0,end = nums.length - 1;
       while(mid <= end){
          switch(nums[mid]){
            case 0:
            {
                swap(nums,start,mid);
                start++;
                mid++;
                break;
            }
            case 1:
            {
                mid++;
                break;
            }
            case 2:
            {
                swap(nums,mid,end);
                end--;
                break;
            }
          }
        }
    }
    static void swap(int[] arr,int pos1,int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}