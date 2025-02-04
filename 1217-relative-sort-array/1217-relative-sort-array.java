class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr1){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele) + 1);
            }else{
                map.put(ele,1);
            }
        }
        int count = 0;
        int[] result = new int[arr1.length];
        for(int ele : arr2){
            while(map.get(ele)>0){
                result[count] = ele;
                count++;
                map.put(ele,map.get(ele)-1);
            }
            map.remove(ele);
        }
        int[] remaining = new int[arr1.length-count];
        int index = 0;
        for(int ele : arr1){
            if(map.containsKey(ele)){
               while(map.get(ele)>0){
                remaining[index] = ele;
                index++;
                map.put(ele,map.get(ele)-1);
               }
               map.remove(ele);
            }
        }
        Arrays.sort(remaining);
        for(int ele : remaining){
            result[count] =  ele;
            count++;
        }
        return result;
    }
}