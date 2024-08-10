class Solution {
    public int reversePairs(int[] nums) {
         return invCount(nums, 0, nums.length - 1);
    }
     public int invCount(int[] nums, int left, int right) {
        if (left == right) {
            return 0;
        }
        // Divide the array into two parts
        int mid = (left + right) / 2;
        int a = invCount(nums, left, mid);
        int b = invCount(nums, mid + 1, right);
        // Merge the two parts
        int aWithB = mergeSort(nums, left, mid, right);
        return a + b + aWithB;
    }

    public int mergeSort(int[] nums, int left, int mid, int right) {
        int count = 0;
        int i = left;    // i is index for left subarray
        int j = mid + 1; // j is index for right subarray
        int k = 0;       // k is index for resultant merged subarray
        int[] C = new int[right - left + 1];

        // Counting number of valid pairs
        while (i <= mid && j <= right) {
            if ((long) nums[i] > (long) 2 * nums[j]) {
                count += (mid - i + 1);
                j++;
            } else {
                i++;
            }
        }

        // Using Merge Sort to sort and update resultant array
        i = left;
        j = mid + 1;
        k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                C[k++] = nums[i++];
            } else {
                C[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            C[k++] = nums[i++];
        }

        while (j <= right) {
            C[k++] = nums[j++];
        }

        // Copy back the merged elements to the original array
        k = 0;
        for (int z = left; z <= right; z++) {
            nums[z] = C[k++];
        }

        return count;
    }
}