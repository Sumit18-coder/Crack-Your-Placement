class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
               int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // stores pair of (temperature, index)

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] pop = stack.pop();
                result[pop[1]] = i - pop[1];
            }
            stack.push(new int[]{temp, i});
        }

        return result;
    }
}