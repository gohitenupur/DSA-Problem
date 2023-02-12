package AssignmentWork;

import java.util.Scanner;

public class InsertValueInAnArray {
    public static void main(String[] args) {
//        // input in the  runtime
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int pos=sc.nextInt();
//        int val=sc.nextInt();

        int arr[]={9,12,3,7,89,34,15,16,67,25};
        int pos=4;
        int val =36;
        insertAtPosition(arr,pos,val);

        for(int var : arr){
            System.out.print(var+" ");
        }
    }

    private static void insertAtPosition(int[] arr, int k, int val) {
        for (int i=arr.length-1;i>k;i--){
            arr[i]=arr[i-1];
        }
        arr[k]=val;
    }
}
