package ArraysProgram;

public class FindMaxMin {
    public static void main(String[] args) {
        int [] arr = {5,3,1,34,7,9};
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        int len =arr.length;
//        if(len==1){
//            max=min=arr[0];
//        }
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            max=Math.max(arr[i],max);
        }
        System.out.println("Min Value "+min);
        System.out.println("Max Value "+max);
    }
}
