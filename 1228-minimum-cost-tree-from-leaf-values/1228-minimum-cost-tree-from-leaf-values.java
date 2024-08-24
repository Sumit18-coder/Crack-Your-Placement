class Solution {
    public int mctFromLeafValues(int[] arr) {
        int totalcost = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(Integer.MAX_VALUE);
        for(int leaf : arr){
            while(stack.peek() <= leaf){
                int mid = stack.pop();
                totalcost += mid * Math.min(stack.peek(),leaf);
            }
            stack.push(leaf);
        }
        while(stack.size() > 2){
            totalcost += stack.pop() * stack.peek();
        }
        return totalcost;
    }
}