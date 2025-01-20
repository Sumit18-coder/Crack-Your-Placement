class Solution {
    public int[] arrayRankTransform(int[] arr) {
         if(arr.length == 0) {
            return new int[]{};
        }
        
        int min = arr[0];
        int max = arr[0];
        for(int num : arr) {
            if(min > num) {
                min = num;
            } else if(max < num) {
                max = num;
            }
        }
        
        if(max - min > 1000000) { return getRanks(arr); }

        int[] ranks = new int[max - min + 1];
        for(int num : arr) {
            ranks[num - min] = 1;
        }
        for(int id = 1; id < ranks.length; id++) {
            ranks[id] += ranks[id - 1];
        }
        int []result = new int[arr.length];
        int id = 0;
        for(int num : arr) {
            result[id++] = ranks[num - min];
        }
        return result;
    }

    private int[] getRanks(int[] arr) {
        Integer[] indexes = new Integer[arr.length];
        int[] ranks = new int[arr.length];

        for(int index = 0; index < arr.length; index++) {
            indexes[index] = index;
        }

        Arrays.sort(indexes, (i1, i2) -> arr[i1] - arr[i2]);

        int rank = 0;
        int prev = arr[0] ^ 1;
        for(int index = 0; index < indexes.length; index++) {
            if(prev != arr[indexes[index]]) {
                ++rank;
            }
            ranks[indexes[index]] = rank;
            prev = arr[indexes[index]];
        }

        return ranks;
    }
}