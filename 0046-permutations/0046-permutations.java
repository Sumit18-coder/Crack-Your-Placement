class Solution {
    private void backtrack(List<List<Integer>> resultlist,ArrayList<Integer> templist,int[] nums){
        //matches the length means it's a permutation
        if(templist.size() == nums.length){
            resultlist.add(new ArrayList<>(templist));
            return;
        }
        for(int number : nums){
            //skip if we get same element
            if(templist.contains(number)){
                continue;
            }
            templist.add(number);
            backtrack(resultlist,templist,nums);
            templist.remove(templist.size() - 1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultlist = new ArrayList<>();
        backtrack(resultlist,new ArrayList<>(),nums);
        return resultlist;
    }
}