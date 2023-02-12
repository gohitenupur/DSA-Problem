package SortingTechnique;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {8,7,2,9,4,1};

        for(int i=1;i<arr.length;i++){
            int temp =arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int var:arr){
            System.out.print(var+" ");
        }

    }
}
