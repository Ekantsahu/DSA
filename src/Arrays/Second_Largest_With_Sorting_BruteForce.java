package Arrays;

public class Second_Largest_With_Sorting_BruteForce {
    //This is a bruteforce solution

    public static void main(String[] args) {
        //time complexity of bubble sort O(n2) because the loop is running n-1 times
        int arr[] = {12,35,1,10,34,1};
        System.out.print("Unsorted array : ");
        for (int print: arr){
            System.out.print(print+" ");
        }
        for (int i = 0; i < arr.length-1; i++ ){
            for (int j = 0;j < arr.length-1; j++ ){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("\nSorted array : ");
        for (int print: arr){
            System.out.print(print+" ");
        }

        //how to find the second largest it is big O(n)
        int length = arr.length;
        int largest = arr.length-1;
        int secondLargest = 0;
        for (int i = length-2; i>0 ; i++){
            if (arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("\nSecond Largest : "+secondLargest);
    }
}
/*
    * Input: arr[] = [12, 35, 1, 10, 34, 1]
      Output: 34
      Explanation: The largest element of the array is 35 and the second-largest element is 34.


      Input: arr[] = [10, 5, 10]
      Output: 5
      Explanation: The largest element of the array is 10 and the second largest element is 5.


      Input: arr[] = [10, 10, 10]
      Output: -1
      Explanation: The largest element of the array is 10 there is no second largest element.*/