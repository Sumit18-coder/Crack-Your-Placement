class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length - 1;i++){
            int diff = arr[i+1] - arr[i];
            if(diff<min){
                min = diff;
                result.clear();
                result.add(Arrays.asList(arr[i],arr[i+1]));    
            }else if(diff == min){
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return result;
    }
}