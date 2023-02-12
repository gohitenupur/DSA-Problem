package ArraysProgram;

public class FindMissingEle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};
        int len =arr.length+1;

        int sum =len*(len+1)/2;

        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
        }
        System.out.println(sum);
    }
}
