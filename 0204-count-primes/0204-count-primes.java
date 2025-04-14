class Solution {
    public int countPrimes(int n) {
        boolean[] valid = new boolean[n];
        int ans = 0;
        for(int num = 2;num < n;num++){
            if(valid[num]) continue;
            ans += 1;
            for(long mult = (long)num * num;mult < n;mult += num)
                valid[(int)mult] = true;
        }
        return ans;
    }
}