package SortingTechnique;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {8, 7, 2, 9, 4, 1};
//        int len = arr.length;
       for(int i=0;i<arr.length;i++){
           int smallest =i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[smallest]>arr[j]){
                    smallest=j;
               }
           }
           int temp = arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=temp;
       }
        for (int var : arr) {
                System.out.print(var + " ");
        }




    }
}