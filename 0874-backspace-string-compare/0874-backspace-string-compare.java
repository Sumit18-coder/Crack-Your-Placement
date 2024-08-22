class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }
    public String getActual(String input){
        StringBuilder actualString = new StringBuilder();
        int hashCount = 0;

        for(int i = input.length() - 1; i >= 0; i--){
            //keep a count of backspace character
            if(input.charAt(i) == '#'){
                hashCount++;
                continue;
            }
            //if backspace count > 0 then reduce it and skip the character 
            if(hashCount > 0){
                hashCount--;
            }else{
            //if no backspace,then insert at the beginning
            actualString.insert(0,input.charAt(i));
            }
        }
        return actualString.toString();
    }
}