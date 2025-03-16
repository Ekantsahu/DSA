package Arrays;

import java.util.Arrays;

public class Left_Rotate_An_Array {
    //optimal solution Time complexity is Big O of n cause we are running the loop n times
    public static int [] rotatingLeft(int []arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++){
            arr[i-1]=arr[i];
        }
          arr[arr.length-1] = temp;
        return arr;
    }

    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Before left rotation : "+ Arrays.toString(arr));
        rotatingLeft(arr);
        System.out.println("After left rotation : "+Arrays.toString(arr));


    }

}
