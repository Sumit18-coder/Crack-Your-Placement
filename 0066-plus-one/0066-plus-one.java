class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1;i >= 0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] new_number = new int[n+1];
        new_number[0] = 1;
        return new_number;
    }
}
//1st conditions checks if digit at 1's place is less than the digit/not
// [2,3,5]
// o/p:- [2,3,6]
//if not then place 0 at the 1's place
//in case of all digits in array equal to '9' then replace the digit at 0th index by '1'.