    package Arrays;

    import java.util.Vector;

    public class Second_Largest_Optimal {
        public static int secondLargest(int[] arr,int n){
//          {3,4,5,1,2,3}
            int largest = arr[0];
            int slargest = -1;
            for (int i = 1; i<n; i++){
                if (arr[i] > largest){
                    slargest = largest;//3,4,
                    largest = arr[i];//4,5,
                }else if (arr[i] < largest && arr[i] > slargest){
                    slargest = arr[i];
                }
            }
            return slargest;
        }
        public static int secondSmallest(int []arr,int n){
            int smallest = arr[0];
            int ssmallest = Integer.MAX_VALUE;
            for (int i = 1; i<n;i++){
                if (arr[i]<smallest){
                    ssmallest = smallest;
                    smallest = arr[i];
                }else if (arr[i] > smallest && arr[i] < ssmallest){
                    ssmallest = arr[i];
                }
            }
            return ssmallest;
        }
        public static void main(String[] args) {
            int []arr = {3,4,5,1,2,3};

            int slargest = secondLargest(arr,arr.length);
            int smallest = secondSmallest(arr, arr.length);
            System.out.println("Second Largest : "+slargest);
            System.out.println("Second smallest : "+smallest);
        }
    }
