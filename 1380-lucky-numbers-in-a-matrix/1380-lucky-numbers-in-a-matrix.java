class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0;i < m;i++){
            int minCol = 0;

            //find min element in curr row
            for(int j = 1;j < n;j++){
                if(matrix[i][j] < matrix[i][minCol]){
                    minCol = j;
                }
            }
            int candidate = matrix[i][minCol];
            
            //check if max is in col
            boolean isLucky = true;
            
             for (int k = 0; k < m; k++) {
                if (matrix[k][minCol] > candidate) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                list.add(candidate);
            }
        }
        return list;
    }
}