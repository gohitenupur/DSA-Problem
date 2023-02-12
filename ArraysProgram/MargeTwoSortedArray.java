package ArraysProgram;

public class MargeTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1= new int[]{1,2,3,4,5};
        int [] arr2= new int[]{1,2,3,4,5};
        int len1 =arr1.length;
        int len2 =arr2.length;
        int []res = new int[len1+len2];
        int i=0;
        int j=0;
        int k=0;
        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }else{
                res[k++]=arr2[j++];
            }
        }
        while (i<len1){
            res[k++]=arr1[i++];
        }
        while (j<len2){
            res[k++]=arr2[j++];
        }
        for(int t=0;t<res.length;t++){
            System.out.print(res[t]+" ");
        }

    }
}
