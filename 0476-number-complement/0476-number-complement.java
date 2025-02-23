class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        String res = "";
        for(int i = 0;i < binary.length(); i++){
            if(binary.charAt(i) == '0'){
                res += '1';
            }else{
                res += '0';
            }
        }
        return Integer.parseInt(res,2);
    }
}