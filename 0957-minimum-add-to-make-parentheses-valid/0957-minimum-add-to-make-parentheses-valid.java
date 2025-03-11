class Solution {
    public int minAddToMakeValid(String s) {
        int openBrackets = 0,minAddsRequired = 0;
        for(int c : s.toCharArray()){
            if(c == '('){
                openBrackets++;
            }else{
                if(openBrackets > 0){
                    openBrackets--;
                }else{
                    minAddsRequired++;
                }
            }
        }
        return openBrackets + minAddsRequired;
    }
}