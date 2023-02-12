package MatrixProgram;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the matrix length :");
        int n =sc.nextInt();
        int [][] arr=new int[n][n];
        System.out.println("Enter the element :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        int row = arr.length;
        int col = arr[0].length;
        System.out.println(" Enter a target element ");
        int target= sc.nextInt();
//        int ele = searchElement(arr ,row,col,target);
////        if(ele ==1){
////            System.out.println("Element Found");
////        }else{
////            System.out.println("Not found");
////        }
//        System.out.println(ele);
       int ele = binarySearchTech(arr,row,col,target);
        if(ele ==1){
            System.out.println("Element Found");
        }else if(ele== -1){
            System.out.println("Not found");
        }

    }

    private static int binarySearchTech(int[][] arr, int row, int col, int target) {
        int start =0;
        int end =row*col-1;
        int count =0;
        int mid =start+(end-start)/2;
        while (count<end){

            int element =arr[mid/col][mid%col];

            if(element==target){
                return 1;

            }else if(element<target){
//                System.out.println(element);
                start=mid+1;
            }else {
                end=mid-1;
            }
            mid=start+(end-start)/2;
            count++;

        }
        return -1;
    }

    private static int searchElement(int[][] arr, int row, int col, int target) {
        int idx =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if (arr[i][j] == target) {
                    return idx =arr[i][j];
                }
            }
        }
        return 0;
    }
}
