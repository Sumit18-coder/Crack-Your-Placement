class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> main = new Stack<>();
        for(char c:s.toCharArray()){
            if(!main.isEmpty() && main.peek()[0] == c){
                main.peek()[1]++;//increment count
            }else{
                main.push(new int[]{c,1});//push new character and count of the character
            }if(main.peek()[1] == k){
                main.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!main.isEmpty()){
            int[] top = main.pop();
            while(top[1]-->0)
              sb.append((char) top[0]);
        }
        return sb.reverse().toString();
    }
}