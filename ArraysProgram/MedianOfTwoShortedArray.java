package ArraysProgram;

public class MedianOfTwoShortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,4,7,10};
        int arr2[]={3,5,6,8,9};

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

        if(res.length%2!=0){
            System.out.println();
            int resm=res[0]+res[res.length-1]/2;
            System.out.println("odd length :"+resm);
        }
        else {
            System.out.println();
            int resm=res[0]+res[res.length-1]/2;
            System.out.println("even length "+resm);
        }

//        int n1 = arr1.length;
//        int n2=arr2.length;
//        int low =0;
//        int high;
//        if(n1>n2){
//            high=n1;
//        }else{
//            high=n2;
//        }
//        while(low<high){
//
//            int mid1 =(low+high)/2;
//            int mid2 =(low+high)/2-mid1;

//        }

    }
}
