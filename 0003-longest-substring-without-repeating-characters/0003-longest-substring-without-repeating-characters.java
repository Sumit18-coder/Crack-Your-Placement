class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> Map = new HashMap<Character,Integer>();
        int n = s.length();
        int left = 0;
        int right = 0;
        int len = 0;
        while(right < n){
            if(Map.containsKey(s.charAt(right))) left = Math.max(Map.get(s.charAt(right))+1,left);
            Map.put(s.charAt(right),right);
            len = Math.max(len,right - left + 1);
            right++;
        }
        return len;
    }
}