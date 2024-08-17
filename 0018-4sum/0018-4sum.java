class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int a=0;a<n;a++)
        {
            int b=a+1;
            int c=b+1;
             int d=n-1;
            while(b<d&&b<c){
            while(c<d)
            {
                long sum=(long)nums[a]+nums[b]+nums[c]+nums[d];
                if(sum==target){
                s.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                c++;
                d--;
                }
                else if(sum<target)
                c++;
                else
                d--;

            }
             b++;
             c=b+1;
             d=n-1;
            }
             
        }
        l.addAll(s);
        return l;
    }
}