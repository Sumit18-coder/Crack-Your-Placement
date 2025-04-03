class Solution {
    public int findLUSlength(String[] strs) {
        int res = -1;
        int n = strs.length;
        for(int i = 0;i < n;i++){
            if(strs[i].length() < res)
                continue;
            int j = -1;
            while(++j < n)
                if(i != j && isSubsequence(strs[i],strs[j]))
                  break;
            if(j == n)
                res = Math.max(res,strs[i].length());
        }
        return res;
    }
    private boolean isSubsequence(String a,String b){
        int i = 0,len1 = a.length(),len2 = b.length();
        for(int j = 0;i < len1 && j < len2;j++)
            if(a.charAt(i) == b.charAt(j))
                i++;
        return i == len1;
    }
}