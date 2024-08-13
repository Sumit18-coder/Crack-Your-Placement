import java.util.Arrays;
public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {4,1,3,8,2,9};
        int target = 2;
        int ans = findCeiling(arr,target);
        System.out.println(ans);
    }

    static int findCeiling(int[] arr,int target){
        int low = 0, high = arr.length - 1;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                result = arr[mid];
                high = mid - 1;
            }
        }
        return result;
    }
}
