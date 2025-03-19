package Arrays;

public class Minimum_In_Rotated_Sorted_Array {
    public static int minimumInRotatedSortedArray(int []arr){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int low = 0,high = n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            //already sorted then
            if (arr[low]<=arr[high]){
                return Math.min(ans,arr[low]);
            }

            //if the left half is sorted
            if (arr[low]<=arr[mid]){
                //assign the minimum value of
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int minimum = minimumInRotatedSortedArray(arr);
        System.out.println(minimum);

    }
}
