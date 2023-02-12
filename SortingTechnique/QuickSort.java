package SortingTechnique;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={4,3,7,9,2,1};
        int len = arr.length;
        quickSort(arr,0,len-1);
        for(int var : arr){
            System.out.print(var+" ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pivitIdx=partitions(arr,low,high);

            quickSort(arr,low,pivitIdx-1);
            quickSort(arr,pivitIdx+1 ,high);

        }
    }

    private static int partitions(int[] arr, int low, int high) {
        int pivit =arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivit){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp =arr[i];
        arr[i]=pivit;
        arr[high]=temp;
        return i;
    }
}
