class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left = 0,right = 0;
        while(right < arr.length){
            if(arr[right] == ' '){
                reverse(arr,left,right - 1);
                left  = right + 1;
            }
            right++;
        }
    
        reverse(arr,left,right - 1);
        return new String(arr);
    }
        private void reverse(char[] arr,int left,int right){
            while(left < right){
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
}