package Arrays;

public class First_and_Last_Binary_Search {
    public static int first(int [] arr, int target){
        int n = arr.length;
        int high = n-1,low = 0,first = -1;
        while (low<=high){
            int mid = low+(high-low)/2;
//            1,2,3,4,4,4,5,6
            if (arr[mid]==target){
                first = mid;
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return first;
    }
    public static int last(int [] arr, int target){
        int n = arr.length;
        int high = n-1,low = 0,last = -1;
        while (low<=high){
            int mid = low+(high-low)/2;
//            1,2,3,4,4,4,5,6
            if (arr[mid]==target){
                last = mid;
                low = mid+1;
            }else if(arr[mid]<target){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,4,4,5,6};
        int target = 8;
        int first = first(arr,target);
        int last = last(arr,target);
        if (first==-1||last==-1){
            System.out.println(first+" "+last);
        }else
            System.out.println(first+" "+last);



    }
}
