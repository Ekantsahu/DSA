package Arrays;

public class Single_Element_In_Sorted_Array {
    public static int findingSingleElement(int[] arr) {
        int n = arr.length;
        if (arr[0] == n)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low);
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            //eliminating left side
            /*if odd index and arr[mid] == arr[mid-1] or even index and arr[mid] == arr[mid+1] then the left side will
            * be eliminated because any how the single element will not be on left side*/
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            }
            //eliminating right side

            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,5,6,7,7,8,8};
        System.out.println(findingSingleElement(arr));
    }
}

