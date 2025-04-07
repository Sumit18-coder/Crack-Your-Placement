class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0;i < s.length();i++){
            if(map.get(s.charAt(i)) < k){
                int leftPart = longestSubstring(s.substring(0,i),k);
                int rightPart = longestSubstring(s.substring(i+1),k);
                return Math.max(leftPart,rightPart);
            }
        }
        return s.length();
    }
}