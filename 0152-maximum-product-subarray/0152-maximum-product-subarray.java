class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty or null array
        }
        
        // Initialize max and min products for the current position
        int currMax = nums[0]; // Maximum product ending at current index
        int currMin = nums[0]; // Minimum product ending at current index
        int globalMax = nums[0]; // Global maximum product
        
        // Iterate through array starting from second element
        for (int i = 1; i < nums.length; i++) {
            // Store currMax for use in min calculation (since currMax may change)
            int tempMax = currMax;
            
            // Maximum product at current index is either:
            // 1. Current element alone
            // 2. Current element * previous max product
            // 3. Current element * previous min product (if both are negative)
            currMax = Math.max(nums[i], Math.max(nums[i] * currMax, nums[i] * currMin));
            
            // Minimum product at current index
            currMin = Math.min(nums[i], Math.min(nums[i] * tempMax, nums[i] * currMin));
            
            // Update global maximum
            globalMax = Math.max(globalMax, currMax);
        }
        
        return globalMax;
    }
}