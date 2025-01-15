class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int ele: nums1){
            set.add(ele);
        }
        for(int ele : nums2){
            if(set.contains(ele)){
                result.add(ele);
            }
        }
        int res[] = new int[result.size()];
        int i = 0;
        for(int ele : result){
            res[i++] = ele;
        }

        return res;
    }
}