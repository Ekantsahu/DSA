package Arrays;

public class Lower_Bound_Binary_Search {
    public static int gettingElement(int arr[], int target){
        int  n = arr.length;
        int low = 0, high = n-1;
        int ans = n;
        while (low<=high){
//        array 1,2,3,4,5,6,7,8,9
//        index 0,1,2,3,4,5,6,7,8
//            maybe an answer
            int mid= (low+high)/2;
            if (arr[mid] >= target){
                ans = mid;
//                look for small index on left
                high = mid - 1;
            }
            else{
                low = mid + 1;//look for right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};
        int element = gettingElement(arr,3);
        System.out.println(element);
    }
}
