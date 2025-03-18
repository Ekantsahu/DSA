package Arrays;

public class Search_Element_In_Rotated_Sorted_Array_Duplicate {
    public static boolean findingElementRotatedSortedArrayDuplicate(int [] arr,int target){
        int n = arr.length;
        int low = 0,high = n-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] == target){
                return true;
            }if (arr[mid] == target && target == arr[high]){
                low = mid + 1;
                high = mid - 1;
                continue;
            }
            if (arr[low]<= arr[mid]){
            if (arr[low]<=target && target<=arr[high]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
         }
     }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {4,4,4,4,4,4,4,4};
        int target = 5;
        boolean isPresent = findingElementRotatedSortedArrayDuplicate(arr,target);
        if (isPresent){
            System.out.println(target+" is Present inside an array ");
        }else {
            System.out.println(target+" is not present inside an array");
        }
    }
}
