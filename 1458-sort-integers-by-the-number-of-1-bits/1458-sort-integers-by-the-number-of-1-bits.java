class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] wrapperArray = new Integer[arr.length];
        int i = 0;
        for(int val : arr){
            wrapperArray[i] = Integer.valueOf(val);
            i++;
        }
        Arrays.sort(wrapperArray,(val1,val2) -> 
        {
            int val1_oneBits = countBits(val1);
            int val2_oneBits = countBits(val2);
            return (val1_oneBits == val2_oneBits)?val1-val2:val1_oneBits-val2_oneBits;
            //val1-val2 will provide us natural binary order of sequence.
            //and val1_oneBits-val2_oneBits will provide us val according to bits
        });
        i = 0;
        for(int val : wrapperArray){
            arr[i] = val;
            i++;
        }
        return arr;
    }
    int countBits(int val){
            int bitCount = 0;
            while(val>0){
                bitCount = bitCount + (val&1);
                val = val >> 1;
            }
            return bitCount;
        }
}