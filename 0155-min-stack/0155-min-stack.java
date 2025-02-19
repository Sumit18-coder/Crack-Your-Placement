class MinStack {
    private List<int[]> stack; 
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        int[] top = stack.isEmpty() ? new int[]{val,val} : stack.get(stack.size() - 1);
        int min_val = top[1];
        if(min_val > val){
          min_val = val;
        }
        stack.add(new int[] {val,min_val});
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.isEmpty() ? -1 : stack.get(stack.size() - 1)[0];
    }
    
    public int getMin() {
        return stack.isEmpty() ? -1 : stack.get(stack.size() - 1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */