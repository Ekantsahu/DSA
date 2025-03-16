package Arrays;

public class Search_Insert_Position {
    public  static  int findingIndex(int [] arr,int target){
        int n = arr.length;
        int low = 0,high = n-1,ans = n;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,6,7,8};
        int target = 5;
        System.out.println("The position where the given element should be inserted is : "+findingIndex(arr,target));
    }
}
