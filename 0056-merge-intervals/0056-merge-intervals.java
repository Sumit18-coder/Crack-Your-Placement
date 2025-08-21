class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> merge = new ArrayList<>();

        for(int[] interval : intervals){
            if(merge.isEmpty() || merge.get(merge.size() - 1)[1] < interval[0]){
                merge.add(interval);
            }else{
                merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1)[1],interval[1]);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
}