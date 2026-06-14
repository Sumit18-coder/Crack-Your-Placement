class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();
        for(int right = 0;right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
    return maxLen;
    }
}
//right forward pointer which adds the character
//left is the pointer which is used to remove the character