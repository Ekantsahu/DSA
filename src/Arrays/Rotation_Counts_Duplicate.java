package Arrays;

public class Rotation_Counts_Duplicate {
    public static int findingRotationalCount(int [] arr){
        int n = arr.length;
        int low = 0,high = n-1;
        int index = -1;
        int ans = Integer.MAX_VALUE;
        while (low <= high){
            int mid = low + (high-low)/2;
            //array is already sorted
            if (arr[low]<=arr[high]){
                if (arr[low]<=ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            //in case of duplicate elements we cannot say which side is sorted
            if (arr[low]==arr[mid]&&arr[mid]==arr[high]){
                if (arr[low]<=ans){
                    index = low;
                    ans = arr[low];
                }
                //so we will shrink the array from both the ends
                low++;
                high--;
                continue;
            }
            //if left side is sorted
            if (arr[low]<=arr[mid]){
                if (arr[low]<=ans){
                    index = low;
                    ans = arr[low];
                }
                low = mid + 1;
            }else{
                //if the right half is sorted
                if (arr[mid]<=ans){
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int noOfRotation = findingRotationalCount(arr);
        System.out.println(noOfRotation);

        // Test with duplicates
        int[] arrWithDuplicates = {3, 3, 3, 1, 2, 3, 3};
        int rotationCount = findingRotationalCount(arrWithDuplicates);
        System.out.println(rotationCount);

    }
}
