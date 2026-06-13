class Solution {
    public int findNumbers(int[] nums) {
        int totalCount = 0;
        for(int num : nums){
            int count = 0;
            int temp = num;
            while(temp != 0){
                temp /= 10;
                count++;
            }
            if(count % 2 == 0){
                totalCount++;
            }
        }
        return totalCount;
    }
}