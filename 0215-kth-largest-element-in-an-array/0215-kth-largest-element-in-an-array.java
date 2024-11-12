class Solution {
    public int findKthLargest(int[] nums, int k) {
        int main_max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            main_max = Math.max(main_max,nums[i]);
        }
        if(map.size() == 1){
            return main_max;
        }
        k -= map.get(main_max);
        while(k > 0){
             main_max--;
             if(map.containsKey(main_max)){
                k -= map.get(main_max);
             }
        }
        return main_max;
    }
}