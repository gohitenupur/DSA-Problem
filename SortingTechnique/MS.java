package SortingTechnique;

public class MS {
    public static void main(String[] args) {
        int []arr ={9,8,4,-5,-2,0,2,7,1};
        mSort(arr,0,arr.length-1);
        for(int var:arr){
            System.out.print(var+" ");
        }
    }

    private static void mSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int mid =(low+high)/2;
        mSort(arr,low,mid);
        mSort(arr,mid+1,high);

        marged(arr,low,mid,high);
    }

    private static void marged(int[] arr, int low, int mid, int high) {
        int[]result =new int[high-low+1];
        int x=0;
        int idx1=low;
        int idx2=mid+1;
        while(idx1<=mid && idx2<=high){
            if(arr[idx1]<arr[idx2]){
                result[x++]=arr[idx1++];
            }else{
                result[x++]=arr[idx2++];
            }
        }
        while (idx1<=mid){
            result[x++]=arr[idx1++];
        }
        while(idx2<=high){
            result[x++]=arr[idx2++];
        }
        for(int i=0,j=low;i<result.length;i++,j++){
            arr[j]=result[i];
        }
    }

}
