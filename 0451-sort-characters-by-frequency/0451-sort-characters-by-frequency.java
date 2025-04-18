class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char str : s.toCharArray()){
            freq.put(str,freq.getOrDefault(str,0) + 1);
        }
        //build a maxHeap based on freq
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a,b) -> freq.get(b) - freq.get(a)
        );
        maxHeap.addAll(freq.keySet());

        StringBuilder result = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            result.append(String.valueOf(c).repeat(freq.get(c)));
        }
        return result.toString();
    }
}