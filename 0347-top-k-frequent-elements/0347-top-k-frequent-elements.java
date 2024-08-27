class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer,Integer> FrequencyMap = new HashMap<>();

        for(int n : nums){
            FrequencyMap.put(n,FrequencyMap.getOrDefault(n,0) + 1);
        }
        for(int Key : FrequencyMap.keySet()){
            int frequency = FrequencyMap.get(Key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }     
            bucket[frequency].add(Key);
        }
        int[] res = new int[k];
        int counter = 0;
        for(int pos = bucket.length - 1; pos >= 0; pos--){
            if(bucket[pos] != null){
                for(Integer integer : bucket[pos]){
                    res[counter++] = integer;
                    if(counter == k){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}