package SortingTechnique;

public class QST {

    public static void main(String[] args) {
        int[] arr={9,6,3,6,1,2};
        quickS(arr,0,arr.length-1);
        for(int var:arr){
            System.out.print(var+" ");
        }
    }

    private static void quickS(int[] arr, int low, int high) {

        if(low<high){
            int pidx=partitionTech(arr,low,high);

            quickS(arr,low,pidx-1);
            quickS(arr,pidx+1,high);

        }
    }

    private static int partitionTech(int[] arr, int low, int high) {
        int x=low-1;
        int pivot =arr[high];

        for(int i=low;i<high;i++){
            if(arr[i]<pivot){
                x++;
                int temp = arr[x];
                arr[x]=arr[i];
                arr[i]=temp;
            }
        }
            x++;
            int swp = arr[x];
            arr[x]=pivot;
            arr[high]=swp;

        return x;
    }


}
