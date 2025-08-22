class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int val = matrix[mid / n][mid % n];
            if (val == target) return true;
            else if (val < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
