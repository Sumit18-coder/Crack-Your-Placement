class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        //start bracktracking from beginning
        backtrack(resultList,new ArrayList<>(),nums,0);
        return resultList; 
    }
    private void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet,int[] nums,int start){
        //add the set to result set
        resultSets.add(new ArrayList<>(tempSet));
        for(int i = start;i < nums.length;i++){
            //case of including the number
            tempSet.add(nums[i]);
            //bactrack the set
            backtrack(resultSets,tempSet,nums,i + 1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
}