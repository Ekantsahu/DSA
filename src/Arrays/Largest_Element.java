package Arrays;

public class Largest_Element {
    public static void main(String[] args) {
        int arr[] = {3,5,2,6,7,8};
        int largest = arr[0];
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
