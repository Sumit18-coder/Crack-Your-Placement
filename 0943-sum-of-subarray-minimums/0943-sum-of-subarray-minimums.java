class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nextSm = nextSmaller(arr);
        int[] prevSm = prevSmaller(arr);
        int mod = 1000000007;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int first = i - prevSm[i];      // Distance to the previous smaller element
            int second = nextSm[i] - i;     // Distance to the next smaller element
            long prod = (first * second) % mod;
            prod = (prod * arr[i]) % mod;   // Multiply by arr[i] (minimum of this subarray)
            count = (int)(count % mod + prod) % mod;
        }

        return count;
    }

    // Function to find the index of the next smaller element
    private int[] nextSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        
        return ans;
    }

    // Function to find the index of the previous smaller element
    private int[] prevSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        
        return ans;
    }
}