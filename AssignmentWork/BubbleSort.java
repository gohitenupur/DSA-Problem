package AssignmentWork;

import java.util.Scanner;

// Question Number -7
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n =sc.nextInt();
        System.out.println("Enter the array elements :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Before Sorting :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
