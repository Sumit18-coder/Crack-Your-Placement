class Solution {
    public int compress(char[] chars) {
        int i = 0;//pointer for curr array will read
        int index = 0;//pointer for new array will write
        while(i < chars.length){
            char current = chars[i];
            int count = 0;
            //check if next eleis same 
            while(i < chars.length && chars[i] == current){
                count++;
                i++;
            }
            //update the array
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