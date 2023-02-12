package ArraysProgram;

public class LongestContiguousSubArray {
    public static void main(String[] args) {
        int []arr ={-3,-4,4,-1,-2,1,5,-3};

        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<j;k++){
                    sum=sum+arr[k];
                }
                if(max<sum){
                    max=sum;
                }

            }

        }
        System.out.println(max);




//        int sum =arr[0];
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            sum=sum+arr[i];
//            if(sum<arr[i]){
//                sum=arr[i];
//            }
//            if(max<sum){
//                max=sum;
//            }
//        }
//        System.out.println(max);
//        for(int var:arr){
//            System.out.print(var+" ");
//        }
    }
}
