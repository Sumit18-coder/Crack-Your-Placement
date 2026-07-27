class Solution {
    public int compress(char[] chars) {
        int index = 0;//pos to write
        int i = 0;//pos to read
        while(i < chars.length){
            char current = chars[i];
            int count = 0;
            //count consective characters
            while(i < chars.length && chars[i] == current){
                count++;
                i++;
            }
            //write the character
            chars[index++] = current;

            if(count > 1){
                for(char ch : String.valueOf(count).toCharArray()){
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}