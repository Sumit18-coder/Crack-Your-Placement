class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxGold = 0;
        class Helper{
            public int dfs(int row,int col){
                if(row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == 0){
                   return 0;
                }

                int currentGold = grid[row][col];
                grid[row][col] = 0;
                
                //recursively explore up,down,left,right
                int d = dfs(row + 1, col);
                int u = dfs(row - 1, col);
                int l = dfs(row, col - 1);
                int r = dfs(row, col + 1);

                grid[row][col] = currentGold;

                return currentGold + Math.max(Math.max(d,u),Math.max(r,l));
            }
        }
        Helper helper = new Helper();

        //iterate over each cell
        for(int row = 0;row < m; ++row){
            for(int col = 0;col < n; ++col){
                if(grid[row][col] > 0){
                    maxGold = Math.max(maxGold,helper.dfs(row,col));
                }
            }
        }
        return maxGold;
    }
}