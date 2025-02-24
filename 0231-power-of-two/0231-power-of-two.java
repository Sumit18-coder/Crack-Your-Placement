class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0;i < 31; i++){
            int powerOfTwo = (int) Math.pow(2,i);
            if(powerOfTwo == n){
                return true;
            }else if(powerOfTwo > n){
                return false;
            }
        }
        return false;
    }
}