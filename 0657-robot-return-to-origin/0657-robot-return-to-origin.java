class Solution {
    public boolean judgeCircle(String moves) {
        int leftRight = 0;
        int upDown = 0;
        for(char c : moves.toCharArray()){
            switch(c){
                case 'U':
                    upDown++;
                    break;
                case 'D':
                    upDown--;
                    break;
                case 'L':
                    leftRight++;
                    break;
                case 'R':
                    leftRight--;
                    break;
            }
        }
        return (leftRight == 0 && upDown == 0);
    }
}