class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n){
            if((i+2) < n && s.charAt(i+2) == '#'){
                String str = s.substring(i,i+2);
                int temp = Integer.parseInt(str);
                char ch = (char)(temp+96);
                sb.append(ch);
                i = i+3;
            }else{
                char ch = s.charAt(i);
                sb.append((char)(ch+48));
                i++;
            }
        }
        return sb.toString();
    }
}