class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int res = 0,i = 0,maxFreq = 0;
        for(int j = 0;j < s.length();j++){
            char ch = s.charAt(j);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,freq.get(ch));
            while((j-i+1) - maxFreq > k){
                char left = s.charAt(i);
                freq.put(left,freq.get(left)- 1);
                i++;
            }
            res = Math.max(res,j-i+1);
        }
        return res;
    }
}