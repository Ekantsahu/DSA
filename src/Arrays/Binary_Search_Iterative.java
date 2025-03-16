package Arrays;

public class Binary_Search_Iterative {
    public static int findingElement(int [] arr,int target){
//        low ------------------------------high
//        high---------low

        int low = 0,high = arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                low = mid+1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int target = 10;
        int answer = findingElement(arr,target);
        if (answer == -1){
            System.out.println("Target element is not present");
        }else {
            System.out.println("Target element is at index: "+answer);
        }
    }
}
