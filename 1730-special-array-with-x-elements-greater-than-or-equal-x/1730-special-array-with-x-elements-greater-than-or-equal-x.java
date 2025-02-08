class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int candidateNum = 1;candidateNum <= n;candidateNum++){
            if(candidateNum == findNum(nums,n,candidateNum)){
                return candidateNum;
            }
        }
        return -1;
    }
    private int findNum(int[] nums,int n,int currNum){
        int left = 0;
        int right = n - 1;
        int firstIndex = n;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] >= currNum){
                firstIndex = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return n - firstIndex;
    }
}