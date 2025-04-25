class Solution {
    public boolean judgeSquareSum(int c) {
        for(int d = 2;d * d <= c; d++){
            if(c % d == 0){
                int exponentCount = 0;
                while(c % d == 0){
                    exponentCount++;
                    c /= d;
                }
                if(d % 4 == 3 && exponentCount % 2 != 0) return false;
            }
        }
        return c % 4 != 3;
    }
}
/**
1.loop until d*d <= c.
2.check if c mod d equals 0 then initialize expoCount.
3.loop until c mod d then incr expoCount & c equals c/d.
4.check if d % 4 equals 3 & expoCount % 2 not equals 0 then return false.
5.At the end check if c % 4 not equals 3
 */