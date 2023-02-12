package ArraysProgram;

import java.util.Arrays;

public class NegetivePositive {
    public static void main(String[] args) {
        int arr[]={8,-3,-5,6,4,3,-2};
        int i=-1;
        int pivot =0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        for(int var:arr){
            System.out.print(var+" ");
        }

    }
}
