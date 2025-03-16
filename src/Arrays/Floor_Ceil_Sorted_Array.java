package Arrays;

public class Floor_Ceil_Sorted_Array {
    public static int floor(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1, ans = -1; // Initialize ans to -1 (default if no floor exists)

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) { // Valid floor candidate
                ans = mid;
                low = mid + 1;  // Move to the right side
            } else {
                high = mid - 1; // Move to the left side
            }
        }
        return ans; // Returning index (0-based)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;

        System.out.println("The floor index of " + target + " is " + floor(arr, target));
    }
}
