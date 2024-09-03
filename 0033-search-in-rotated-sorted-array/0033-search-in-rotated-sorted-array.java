class Solution {
    public int search(int[] arr,int target){
        if(arr == null || arr.length == 0) return -1;
        return modifiedSearch(arr,target,0,arr.length-1);
    }
    private int modifiedSearch(int[] arr, int target,int left,int right) {
        //not found
        if(left > right)
            return -1;

        int mid = left + ((right - left)/2);
        if(arr[mid] == target)
            return mid;
        
        if(arr[mid] >= arr[left]){
           if(arr[left] <= target && target <= arr[mid])
            return modifiedSearch(arr,target,left,mid - 1);
           else
            return modifiedSearch(arr,target,mid+1,right);
        }else{
            if(arr[mid] <= target && target <= arr[right])
              return modifiedSearch(arr,target,mid+1,right);
            else
              return modifiedSearch(arr,target,left,mid-1);
        }
    }
}