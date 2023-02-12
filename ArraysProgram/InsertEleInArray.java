package ArraysProgram;

public class InsertEleInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k=3;
        int val =24;
        insertAtPosition(arr,k,val);

        for(int var : arr){
            System.out.println(var+" ");
        }
    }

    private static void insertAtPosition(int[] arr, int k, int val) {
        for (int i=arr.length-1;i>k;i--){
            arr[i]=arr[i-1];
        }
        arr[k]=val;
    }
}
