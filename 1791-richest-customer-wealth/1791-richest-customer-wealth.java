class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts){
           //initialize sum with zero.
           int sum = 0;
           for(int anInt : ints){
              sum += anInt;
           }
           //check if sum is greater than the overall ans
           if(sum > ans){
             ans = sum;
           }
        }
        return ans;
    }
}