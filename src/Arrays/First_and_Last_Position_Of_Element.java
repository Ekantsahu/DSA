package arrays;

public class First_and_Last_Position_Of_Element {

    // Function to find the first occurrence of the target element using binary search
    public static int findFirst(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                if (arr[mid] == target) ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Function to find the last occurrence of the target element using binary search
    public static int findLast(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                if (arr[mid] == target) ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6};
        int target = 4;

        int firstIndex = findFirst(arr, target);
        int lastIndex = findLast(arr, target);

        System.out.println("First occurrence index: " + firstIndex);
        System.out.println("Last occurrence index: " + lastIndex);
    }
}
