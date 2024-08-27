class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempAns = new ArrayList<>();
        Arrays.sort(nums);
         return f(nums, 0, tempAns, ans);
    }
    public List<List<Integer>> f(int[] nums, int ind, List<Integer> tempAns,List<List<Integer>> ans ){
        if(ind == nums.length){
            if(ans.contains(tempAns)){
              return ans;  
            }
            ans.add(new ArrayList<>(tempAns));
            return ans;
        }
        tempAns.add(nums[ind]);
        f(nums, ind+1, tempAns, ans);
        tempAns.remove(tempAns.size()-1);
        f(nums, ind+1, tempAns, ans);
        return ans;
    }
}