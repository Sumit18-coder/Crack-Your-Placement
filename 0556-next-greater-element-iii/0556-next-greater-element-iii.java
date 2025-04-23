public class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        
        // Step 1: Find the first decreasing digit from the right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        // If no such index exists, return -1 (no greater permutation possible)
        if (i == -1) return -1;
        
        // Step 2: Find the smallest digit on the right that is larger than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: Swap digits[i] and digits[j]
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        
        // Step 4: Reverse the digits after position i
        Arrays.sort(digits, i + 1, digits.length);
        
        // Convert back to integer and handle overflow
        long result = Long.parseLong(new String(digits));
        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }
}