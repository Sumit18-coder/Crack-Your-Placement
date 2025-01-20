
class Solution {
    public int[] arrayRankTransform(int[] a) {
        // Use a TreeMap to automatically sort the values
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Store values in the TreeMap
        for (int val : a) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        // Assign ranks to the values
        int rank = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            map.put(entry.getKey(), rank);
            rank++;
        }

        // Traverse the array and assign ranks based on the map
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = map.get(a[i]);
        }

        // Return the ranks
        return ans;
    }
}