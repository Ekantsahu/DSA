package Arrays;

public class Rotation_Counts {
    public static int noOfTimesArrayRotated(int []arr){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        int low = 0,high = n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            //already sorted then
            if (arr[low]<=arr[high]){
                if (arr[low]<=ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            //if the left half is sorted
            if (arr[low]<=arr[mid]){
                if (arr[low]<ans){
                    index = low;
                    ans = arr[low];
                }
                low = mid+1;
                //if the right half is sorted
            }else{
                if (arr[mid]<ans){
                    index = mid;
                    ans = arr[mid];
                }
                high = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int noOfRotation = noOfTimesArrayRotated(arr);
        System.out.println(noOfRotation);
    }
}
