class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> partition = new ArrayList<>();
        for(int i = 0;i < s.length();){
           int startIndex = i;
           int endIndex = s.lastIndexOf(s.charAt(startIndex));

           for(int k = startIndex + 1;k <= endIndex - 1;k++){
            int lastIndexOfNextChar = s.lastIndexOf(s.charAt(k));
               if(lastIndexOfNextChar > endIndex){
                  endIndex = lastIndexOfNextChar;
                }
            }
        partition.add(endIndex - startIndex + 1);
        i = endIndex + 1;
        }
        return partition;
    }
}