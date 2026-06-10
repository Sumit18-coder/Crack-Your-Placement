class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        
        for(int[] index : indices){
            int r = index[0];
            int c = index[1];

             //increment row
             for(int j = 0;j < n;j++){
                 arr[r][j]++;
             }

             //increment col
             for(int i = 0;i < m;i++){
                 arr[i][c]++;
        
             }
        }

        int count = 0;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(arr[i][j] % 2 != 0){
                    count++;
                }

            }
        }
        return count;
    }
}