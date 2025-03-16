package Arrays;

public class First_and_Last_Occurence_Single_Method {
    public static int[] firstAndLast(int[]arr,int target){
        int first = -1,last = -1;
        int n = arr.length;
        int low = 0,high = n-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if (arr[mid]>=target){
                if (arr[mid]==target){
                    first = mid;
                }
                high = mid-1;
            }else {
                     low = mid+1;
            }
        }
        //Reset low and high so that we can find the last occurence
        low = 0;
        high = n-1;
        while (low<=high){
            int mid =  low +(high-low)/2;
            if (arr[mid]>target){
                high = mid-1;
            }else{
               if (arr[mid]==target)
                   last = mid;
               low = mid +1;
            }
        }
        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,4,5,6};
        int target = 4;
       int [] result =  firstAndLast(arr,target);
       for (int ans : result){
           System.out.print(ans+"   ");
       }

    }
}
