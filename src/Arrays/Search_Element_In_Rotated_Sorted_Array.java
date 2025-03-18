package Arrays;
//unique elements
public class Search_Element_In_Rotated_Sorted_Array {
    public static int searchInRotatedSorted(int []arr,int target){
        int n = arr.length;
        int low = 0,high = n-1;
        while (low<=high){
            int mid  =  low + (high-low)/2;
            if (arr[mid]==target)
                return mid;
            //left side need to be  sorted
//            5,6,7,1,2,3,4
//            0,1,2,3,4,5,6
            if (arr[low]<=arr[mid]){
 /*checking that the element in 0th index which is 5 is less than equal to mid-element index which is 1(5<=1) which
 *  means the left side is not sorted */
                if (arr[low]<=target && target <= arr[mid]){
                    high = mid - 1;
                }else
                    low = mid + 1;
            }else{
                //right is sorted
                if (arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,1,2,3,4};
        int target = 7;
        int answer = searchInRotatedSorted(arr,target);
        System.out.println(answer);
    }
}
