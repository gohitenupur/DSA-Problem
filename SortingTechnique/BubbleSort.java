package SortingTechnique;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8,7,2,9,4,1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
