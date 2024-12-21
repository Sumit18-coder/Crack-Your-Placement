class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        boolean firstrowzero = false, firstcolzero = false;
        
        //check for zero in rows and cols
        for(int i = 0;i < m;i++){
           if(matrix[i][0] == 0)
            firstcolzero = true;
        }
        for(int j = 0;j < n;j++){
            if(matrix[0][j] == 0)
            firstrowzero = true;
        }

        //mark the zeros in matrix
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //set matrix cell to zero based on marked ones
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //zero out first row
        if(firstrowzero){
            for(int j = 0;j < n;j++){
                matrix[0][j] = 0;
            }
        }
        //zero out first col
        if(firstcolzero){
            for(int i = 0;i < m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}