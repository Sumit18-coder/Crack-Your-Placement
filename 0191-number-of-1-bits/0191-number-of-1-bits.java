class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int setBits = 0;
        for(int i = 0;i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                setBits++;
            }
        }
    return setBits;
    }
}