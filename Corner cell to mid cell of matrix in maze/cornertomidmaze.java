import java.util.Arrays;
class cornertomidmaze{
    public static void main(String[] args) {
        int[][] maze = {
            { 3, 5, 4, 4, 7, 3, 4, 6, 3 },
            { 6, 7, 5, 6, 6, 2, 6, 6, 2 },
            { 3, 3, 4, 3, 2, 5, 4, 7, 2 },
            { 6, 5, 5, 1, 2, 3, 6, 5, 6 },
            { 3, 3, 4, 3, 0, 1, 4, 3, 4 },
            { 3, 5, 4, 3, 2, 2, 3, 3, 5 },
            { 3, 5, 4, 3, 2, 6, 4, 4, 3 },
            { 3, 5, 1, 3, 7, 5, 3, 6, 4 },
            { 6, 2, 4, 3, 4, 5, 4, 5, 1 }
        };
        printpath(maze,0,0,"");
    }
    public static void printpath(int[][] maze,int i,int j,String ans){
        if(i == maze.length/2 && j == maze.length/2){
            ans += "("+i+","+j+")->MID";
            System.out.println(ans);
            return;
        }
        //if maze current element is equal to zero mark it is as visited. 
        if(maze[i][j] == 0){
            return;
        }
        //if element is non-zero note it in variable k.
        int k = maze[i][j];
        //mark the cell visited by making the element zero.
        maze[i][j] = 0;

        //now make recursive calls in all 4 directions
        //right call
        if(j+k < maze.length){
            printpath(maze,i,j+k,ans+"("+i+","+j+")->");
        }
        //left call
        if(j-k > 0){
            printpath(maze,i,j-k,ans+"("+i+","+j+")->");
        }
        //down call
        if(i+k < maze.length){
            printpath(maze,i+k,j,ans+"("+i+","+j+")->");
        }
        //up call
        if(i-k > 0){
            printpath(maze,i-k,j,ans+"("+i+","+j+")->");
        }
        maze[i][j] = k;
    }
}