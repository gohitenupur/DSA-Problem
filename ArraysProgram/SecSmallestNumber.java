package ArraysProgram;

public class SecSmallestNumber {
    public static void main(String[] args) {

//        Second largest
        int [] arr=new int[]{1,22,3,41,5,6,7,8,9};
        int max1=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                secMax=max1;
                max1=arr[i];
            }
            else
                if(arr[i]!=max1 && arr[i] > secMax){
                secMax=arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(secMax);



////        Second Smallest
//        int [] arr={1,2,3,4,5,6,7,8,9};
//        int smallest=Integer.MAX_VALUE;
//        int secSmallest=Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<smallest){
//                smallest=Math.min(arr[i],smallest);
//            }
//            if(arr[i]>smallest&& arr[i]<secSmallest){
//                secSmallest=Math.min(arr[i],secSmallest);
//            }
//        }
//        System.out.println(secSmallest);
    }
}
