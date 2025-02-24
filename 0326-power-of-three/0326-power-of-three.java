class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        double logs = Math.log10(n) / Math.log10(3);
        return (logs % 1 == 0);
    }
}