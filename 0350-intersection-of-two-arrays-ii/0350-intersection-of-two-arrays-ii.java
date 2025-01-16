class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int ele : nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : nums2){
            if(map.getOrDefault(ele,0)>0){
                list.add(ele);
                map.put(ele,map.get(ele) - 1);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}