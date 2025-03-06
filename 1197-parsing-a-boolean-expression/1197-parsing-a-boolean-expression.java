class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();

        for(char currChar : expression.toCharArray()){
            if(currChar == ',' || currChar == '(') continue;
            if(currChar == 'f' || currChar == 't' || currChar == '|' || currChar == '&' || currChar == '!'){
                stack.push(currChar);
            }else if(currChar ==  ')'){
                boolean hasTrue = false, hasFalse = false;
                while(stack.peek() != '!' && stack.peek() != '&' && stack.peek() != '|'){
                    char topValue = stack.pop();
                    if(topValue == 't') hasTrue = true;
                    if(topValue == 'f') hasFalse = true; 
                }
                char oper = stack.pop();
                if(oper == '!'){
                    stack.push(hasTrue ? 'f' : 't');
                }else if(oper == '&'){
                    stack.push(hasFalse ? 'f' : 't');
                }else if(oper == '|'){
                    stack.push(hasTrue ? 't' : 'f');
                }
            }
        }
        return stack.peek() == 't';
    }
}