package Arrays;

public class Binary_Search_Recursive {
    public static int searchElement(int [] arr,int high,int low,int target){
        if (low > high)
            return -1;
        int mid = low+(high-low)/2;
        if (arr[mid]==target)
            return mid;
        else if (target>=arr[mid])
            return searchElement(arr, high, mid+1,target);
        else
            return searchElement(arr,mid-1,low,target);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,14};
        int high = arr.length-1;
        int low = 0;
        int target = 14;
        System.out.println(searchElement(arr,high,low,target));
    }
}
