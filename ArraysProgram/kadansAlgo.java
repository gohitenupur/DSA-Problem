package ArraysProgram;

public class kadansAlgo {
    public static void main(String[] args) {
        int[] arr ={-5,4,6,-3,4,-1};

        int maxSum =Integer.MIN_VALUE;
        int currSum =0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        System.out.println(maxSum);
    }
}
