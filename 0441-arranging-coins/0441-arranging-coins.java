class Solution {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        while(start<=end){
            long pivot = start + (end - start)/2;
            long coinsUsed = pivot * (pivot+1)/2;
            if( coinsUsed == n){
                return (int)pivot;
            }else if(n < coinsUsed){
                end = pivot - 1;
            }else{
                start = pivot + 1;
            }
        }
        return (int)end;
    }
}