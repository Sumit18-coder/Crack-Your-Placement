class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length,cols = matrix[0].length;
        int low = matrix[0][0],high = matrix[rows - 1][cols - 1];
        while(low <= high){
            int mid = low + (high - low)/2;
            int count = 0,maxNum = low;
            for(int r = 0,c = cols - 1;r < rows;r++){
                while(c >= 0 && matrix[r][c] > mid) c--;
                if(c >= 0){
                    count += (c + 1);
                    maxNum = Math.max(maxNum,matrix[r][c]);
                }else{
                    break;
                }
            }
            if(count == k) return maxNum;
            else if(count < k) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}