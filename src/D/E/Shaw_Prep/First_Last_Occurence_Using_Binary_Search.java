package D.E.Shaw_Prep;

public class First_Last_Occurence_Using_Binary_Search {
    public static boolean fLastOccurence(int []arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                if (arr[i+1]!=arr[i+2]){
                    System.out.println(arr[i+1]);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4};
        System.out.println(fLastOccurence(arr));
    }

}
