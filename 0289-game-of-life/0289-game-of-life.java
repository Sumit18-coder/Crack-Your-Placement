class Solution {
    public void gameOfLife(int[][] board) {
        int[][] clone = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                clone[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int live = findlive(i, j, clone);
                if (clone[i][j] == 1) {
                    if (live < 2 || live > 3) {
                        board[i][j] = 0; 
                    }
                } else {
                    if (live == 3) {
                        board[i][j] = 1; 
                    }
                }
            }
        }
    }


    private int findlive(int i, int j, int[][] board) {
        int live = 0;


        if (i + 1 < board.length && board[i + 1][j] == 1) live++; // Down
        if (j + 1 < board[0].length && board[i][j + 1] == 1) live++; // Right
        if (i - 1 >= 0 && board[i - 1][j] == 1) live++; // Up
        if (j - 1 >= 0 && board[i][j - 1] == 1) live++; // Left
        if (i + 1 < board.length && j + 1 < board[0].length && board[i + 1][j + 1] == 1) live++; // Down-right
        if (i + 1 < board.length && j - 1 >= 0 && board[i + 1][j - 1] == 1) live++; // Down-left
        if (i - 1 >= 0 && j + 1 < board[0].length && board[i - 1][j + 1] == 1) live++; // Up-right
        if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) live++; // Up-left
        return live;
    }
}
