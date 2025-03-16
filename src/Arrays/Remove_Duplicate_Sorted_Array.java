package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Sorted_Array {
    //optimal solution for finding how many duplicate characters are there in an array only if the array is sorted
    public static int duplicate(int []arr){
        int i = 0;
        int n = arr.length;
        for (int j = 1; j<n; j++){
            if (arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
       return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,7,7,5,6};
        System.out.println(duplicate(arr));
    }
}
