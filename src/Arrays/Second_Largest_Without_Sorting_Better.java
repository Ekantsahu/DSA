package Arrays;

public class Second_Largest_Without_Sorting_Better {
    public static void main(String[] args) {
        //This will be a Better solution
        int arr[] = {12,35,1,10,34,1};
        //first we will find the highest
        int largest = arr[0];
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element : "+largest);
        //finding second largest
        //second largest is -1 because there might be the possibility that there would me no second largest
        int secondLargest = -1;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        if (secondLargest == -1){
            System.out.println("There is no second largest!!! LOL");
        }else
        System.out.println("Second Largest : "+secondLargest);
    }
}
