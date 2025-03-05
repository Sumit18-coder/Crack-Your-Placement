class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstrowzero = false;
        boolean firstcolzero = false;

        for(int i = 0;i < m; i++){
            if(matrix[i][0] == 0){
                firstcolzero = true;
            }
        }

        for(int j = 0;j < n; j++){
            if(matrix[0][j] == 0){
                firstrowzero = true;
            }
        }

        for(int i = 1;i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1;i < m; i++){
            for(int j = 1;j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                matrix[i][j] = 0;
                }
            }
        }
        if(firstrowzero){
           for(int j = 0;j < n; j++){
               matrix[0][j] = 0;
            }
        }
        
        if(firstcolzero){
            for(int i = 0;i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}