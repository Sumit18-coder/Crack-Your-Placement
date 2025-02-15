class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 1,j = 1;
        if(name.charAt(0) != typed.charAt(0)){
            return false;
        }
        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else{
                if(typed.charAt(j) == typed.charAt(j - 1)){
                   j++;
                }else
                   return false;
                }
            }
        if(i == name.length() && j == typed.length()){
            return true;
        }else if( i != name.length() && j == typed.length()){
            return false;
        }else{
            while(j != typed.length()){
                if(typed.charAt(j) == typed.charAt(j - 1)){
                    j++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}