class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        //sort array of strs alphabetically
        Arrays.sort(strs);

        //get the first and last string
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        //start compairing
        for(int i = 0;i < first.length;i++){
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}