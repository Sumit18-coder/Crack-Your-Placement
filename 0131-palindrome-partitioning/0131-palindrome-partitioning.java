class Solution {
      public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> sub=new ArrayList<>();
        findPartition(s, 0, res, sub);
        return res;
    }

    public void findPartition(String s, int index, List<List<String>> res, List<String> sub){
        if(index==s.length()){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                sub.add(s.substring(index,i+1));
                findPartition(s, i+1, res, sub);
                sub.remove(sub.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int e){
        while(start<=e){
            if(s.charAt(start)!= s.charAt(e)){
                return false;
            }
            start++;
            e--;
        }
        return true;
    }
}