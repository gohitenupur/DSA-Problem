package SortingTechnique;

public class MargeSort {
    public static void main(String[] args) {
        int arr[]={4,3,7,2,9,6};
        int len=arr.length;
        divide(arr,0,len-1);
        for(int var:arr) System.out.print(var + " ");

    }

    private static void divide(int[] arr, int start, int end) {
        while(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);


    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int ans[]=new int[end-start+1];
        int x=0;
        int idx1=start;
        int idx2=mid+1;
        while (idx1<=mid && idx2<=end){
            if(arr[idx1]<arr[idx2]){
                ans[x++]=arr[idx1++];
            }else{
                ans[x++]=arr[idx2++];
            }
        }
        while (idx1<=mid){
            ans[x++]=arr[idx1++];
        }
        while (idx2<=end){
            ans[x++]=arr[idx2++];
        }
        for(int i=0,j=start;i<ans.length;i++,j++){
            arr[j]=ans[i];
        }

    }

}