package ArraysProgram;

public class PairArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int target =9;
        int low=0;
        int high =arr.length-1;
        while(low<=high){
            if(arr[low]+arr[high] == target){
                System.out.println(arr[low]+","+arr[high]);
                low++;
                high--;
            }else if (arr[low]+arr[high]>target) {
                high--;
            }else if(arr[low]+arr[high]<target){
                low++;
            }
        }
    }
}
