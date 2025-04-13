class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int noRob = 0;
        for(int i = 0;i < nums.length;i++){
            int newRob = noRob + nums[i];
            int noNewRob = Math.max(rob,noRob);
            rob = newRob;
            noRob = noNewRob;
        }
        return Math.max(rob,noRob);
    }
}