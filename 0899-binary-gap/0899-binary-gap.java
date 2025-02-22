class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int[] indices = new int[count(binary,'1')];

        int index = 0;
        for(int i = 0;i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                indices[index] = i;
                index++; 
            }
        }
        int dis = 0;
        for(int i = 0;i < indices.length - 1;i++){
            if(indices[i+1]-indices[i] > dis){
               dis = indices[i+1]-indices[i];
            }
        }
        return dis;
    }
    public int count(String str,char value){
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == value){
                count++;
            }
        }
        return count;
    }
}