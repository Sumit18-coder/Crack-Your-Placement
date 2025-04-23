class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0) return 0;
        int count = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i : nums){
            hash.put(i,hash.getOrDefault(i , 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : hash.entrySet())
        if((hash.containsKey(entry.getKey() + k) && k != 0) || (k == 0 && entry.getValue() > 1))
            count++;
        return count;
    }
}