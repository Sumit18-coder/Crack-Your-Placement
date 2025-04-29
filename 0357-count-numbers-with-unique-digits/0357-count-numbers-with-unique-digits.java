class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        return helper(new int[10],0,n);
    }
    public int helper(int[] freq,int idx,int n){
        if(idx == n) return 1;
        int count = 1;

        for(int i = 0;i < 10;i++){
            if((freq[i] != 1) && (i != 0 || idx != 0)){
                freq[i] = 1;
                count += helper(freq,idx + 1,n);
                freq[i] = 0;
            }
        }
        return count;
    }
}