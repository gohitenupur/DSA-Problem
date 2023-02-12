package ArraysProgram;

public class SortAnArray012 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,0,0,1,1,2,0,0,1,1};
        int zeroCount =0;
        int oneCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }else if(arr[i]==1) {
                oneCount++;
            }
        }
        for(int i=0;i<zeroCount;i++){
            arr[i]=0;
        }
        for(int i=zeroCount;i<(zeroCount+oneCount);i++){
            arr[i]=1;
        }
        for (int i=(zeroCount+oneCount);i<arr.length;i++){
            arr[i]=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
