class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[row].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] > target){
                col--;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                return binarySearch(matrix[row],target);
            }
        }
        return false;
    }
    public boolean binarySearch(int[] a,int target){
        int start = 0,end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(a[mid] < target){
                start = mid + 1;
            }else if(a[mid] > target){
                end = mid;
            }else{
                return true;
            }
        }
        return false;
    }
}