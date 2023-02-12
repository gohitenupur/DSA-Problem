package ArraysProgram;

public class MedianOfTwoArrayWithDiffSize {
    public static void main(String[] args) {
        int arr1[]={0,0};
        int arr2[]={0,0};
            ////   1 5  | 8 10 18
            ////   2 3  | 6  7
        int n1=arr1.length;
        int n2=arr2.length;
        int low =0;
        int high=n1;
        double result=0;
        while (low<=high){
            int cut1 =(low+high)/2;
            int cut2=(n1+n2)/2-cut1;

            int l1=cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=cut1==n1?Integer.MAX_VALUE:arr1[cut1];
            int r2=cut2==n2?Integer.MAX_VALUE:arr2[cut2];

            if(l1>r2){
                high=cut1-1;
            }else if(l2>r1){
                low=cut1+1;
            }else if (l1<r2 && l2<r1){
                if((n1+n2)%2==0){
                    int mid1=Math.max(l1,l2);
                    int mid2=Math.min(r1,r2);

                     result=(double)(mid1+mid2)/2;
                     break;

                }else {
                     result =(double)Math.min(r1,r2);
                     break;
                }
            }

        }
        System.out.println("Median OF Two Sorted Array is: "+result);
    }
}
