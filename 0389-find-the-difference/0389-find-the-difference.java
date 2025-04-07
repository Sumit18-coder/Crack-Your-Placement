class Solution {
    public char findTheDifference(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        int xor1 = 0,xor2 = 0;
        for(int i = 0;i < s.length();i++){
            xor1 ^= str1[i];
        }
        for(int i = 0;i < t.length();i++){
            xor2 ^= str2[i];
        }
        return (char) (xor1^xor2);
    }
}