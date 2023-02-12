package ArraysProgram;

public class EqilibriumPoint {
    public static void main(String[] args) {
        int arr[]={1,6,7,0,7};

        int sum=0;
        int nextSum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        for (int i=0;i<arr.length;i++){
            sum=sum-arr[i];
            if(sum==nextSum){
                System.out.println("Index Possition : "+i+" Element : "+ arr[i]);
            }
            nextSum=nextSum+arr[i];
        }
    }
}
