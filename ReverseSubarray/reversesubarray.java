import java.util.Arrays;
public class reversesubarray {

    static boolean checkreverse(int arr[],int n){
        //copy of array
       int temp[]  = new int[n];
       for(int i = 0;i < n;i++){
        temp[i] = arr[i];
       }
       //sort
       Arrays.sort(temp);

       //check for front mismatch
       int front;
       for(front = 0;front < n;front++){
        if(temp[front] != arr[front]){
           break;
        }
       }
       //check for back mismatch
       int back;
       for(back = n - 1;back >= 0;back--){
        if(temp[back] != arr[back]){
            break;
        }
       }
       //if whole array is sorted
       if(front >= back){
        return true;
       }
       //
       do{
        front++;
        if(arr[front - 1] < arr[front]){
            return false;
        }
     }while(front != back); 
    return true;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        int n = arr.length;
        if(checkreverse(arr,n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}