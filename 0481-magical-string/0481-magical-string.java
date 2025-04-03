class Solution {
    public int magicalString(int n) {
        if (n == 0) return 0; 
        if (n <= 3) return 1; 

        int[] magic = new int[n + 1];
        magic[0] = 1;
        magic[1] = 2;
        magic[2] = 2;
        
        int countOnes = 1; 
        int index = 2; 
        int writeIndex = 3; 
        
        while (writeIndex < n) {
            int nextNum = 3 - magic[writeIndex - 1]; 
            int frequency = magic[index]; 
            
            for (int i = 0; i < frequency && writeIndex < n; i++) {
                magic[writeIndex] = nextNum;
                if (nextNum == 1) countOnes++;
                writeIndex++;
            }
            index++;
        }
        return countOnes;
    }
}
