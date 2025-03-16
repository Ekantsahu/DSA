package Arrays;

public class Check_If_The_Array_Sorted {
    public static boolean sortedOrNot(int[]arr){
        for (int i = 1 ; i < arr.length; i++){
            if (arr[i]>=arr[i-1]){
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       int arr [] = {1,2,2,5,6};
       if(sortedOrNot(arr)){
           System.out.println("It is sorted");
       }else {
           System.out.println("It is not sorted");
       }
    }
}
