class Solution {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for(int c : tiles.toCharArray()){
            count[c - 'A']++;
        }
        return dfs(count);
    }
    public int dfs(int[] count){
        int res = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                res++;
                count[i]--;
                res += dfs(count);
                count[i]++;
            }
        }
        return res;
    }
}