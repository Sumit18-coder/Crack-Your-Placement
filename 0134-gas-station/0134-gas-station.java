class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, total = 0, diff = 0;
        for (int i = 0; i < gas.length; i++) {
            diff += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                start = i + 1;
            }
        }
        return diff < 0 ? -1 : start;
    }
}