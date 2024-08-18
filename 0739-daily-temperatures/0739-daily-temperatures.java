class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
             Stack<Integer> helperStack = new Stack<>();
             int n = temperatures.length;
             int[] result = new int[n];

             for (int idx = 0; idx < n; idx++) {
            // Ensure stack operations are valid
            while (!helperStack.isEmpty() && temperatures[idx] > temperatures[helperStack.peek()]) {
                int prevIdx = helperStack.pop();
                result[prevIdx] = idx - prevIdx;
            }
            helperStack.push(idx);
        }

        // Remaining indices in the stack have no greater temperatures
        while (!helperStack.isEmpty()) {
            result[helperStack.pop()] = 0;
        }

        return result;
    }
}