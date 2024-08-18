class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int[] nextGreaterElement = new int[nums2.length];
         Stack<Integer> helperStack = new Stack<>();

        // Traverse nums2 array from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            // Remove all elements smaller than or equal to the current element
            while (!helperStack.isEmpty() && helperStack.peek() <= element) {
                helperStack.pop();
            }

            // If the stack is empty, no greater element exists, otherwise the top of the stack is the next greater element
            nextGreaterElement[i] = helperStack.isEmpty() ? -1 : helperStack.peek();

            // Push the current element onto the stack
            helperStack.push(element);
        }

        // Array to store the result for nums1
        int[] result = new int[nums1.length];

        // For each element in nums1, find its corresponding index in nums2 and get the next greater element
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = nextGreaterElement[j];
                    break;
                }
            }
        }

        return result;
    }
}