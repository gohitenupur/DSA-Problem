package ArraysProgram;

import java.util.Arrays;

public class MedianOf2Array1 {

    // 2 sorted Arrays with same size; O(n) time complaxity and O(1) space complaxity
    public static void main(String[] args) {
        int []arr1={1,12,15,26,38};
        int []arr2={2,13,17,30,45};

        int i=0;
        int j=0;
        int m1=-1;
        int m2 =-1;
        for(int count =0;count<=arr1.length;count++){
            if(arr1[i]<arr2[j]){
                m1=m2;
                m2=arr1[i];
                i++;
            }else{
                m1=m2;
                m2=arr2[j];
                j++;
            }
            if(i>=arr1.length){
                m1=m2;
                m2=arr2[0];
                break;
            }else if(j>=arr2.length){
                m1=m2;
                m2=arr1[0];
                break;
            }

        }
        int res =(m1+m2)/2;
        System.out.println("median of 2 array: "+res);









//
//        int len =arr1.length+arr2.length;
//        int[] margedArr =new int[len];
//        int j=0;
//        for (int i=0;i<arr1.length;i++){
//            margedArr[j++]=arr1[i];
//        }
//        for (int i=0;i<arr2.length;i++){
//            margedArr[j++]=arr2[i];
//        }
//        Arrays.sort(margedArr);
//        int low =0;
//        int high =margedArr.length-1;
//        System.out.println(margedArr.length);
//        if(len%2==0){
//            int mid =low+(high-low)/2;
//            int midsec=mid+1;
//            int result=(margedArr[mid]+margedArr[midsec])/2;
//            System.out.println(result);
//
//        }else{
//            int mid =low+(high-low)/2;
//            System.out.println(margedArr[mid]);
//        }
//
//        for (int i=0;i<margedArr.length;i++){
//            System.out.print(margedArr[i]+" ");
//        }

    }
}
