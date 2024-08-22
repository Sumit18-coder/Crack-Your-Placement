class Solution {
    public int calculate(String s) {
        Stack<Integer> numStack = new Stack<>();
        int num = 0;
        int operator = '+';

        for(int index = 0; index < s.length(); index++){
            char charValue = s.charAt(index);
            if(Character.isDigit(charValue)){
                num = (num * 10) + (charValue - '0');
            } 
            if((!Character.isDigit(charValue) && charValue != ' ') || 
            (index == s.length() - 1)){
                if(operator == '+'){
                    numStack.push(num);
                }
                else if(operator == '-'){
                    numStack.push(-1 * num);
                }
                else if(operator == '*'){
                    numStack.push(num * numStack.pop());
                }
                else if(operator == '/'){
                    numStack.push(numStack.pop() / num);
                }
                num = 0;
                operator = charValue;
            }
        }
        int sum = 0;
        while(!numStack.isEmpty()){
            sum = sum + numStack.pop();
        }
        return sum;
    }
}