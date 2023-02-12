package MatrixProgram;

public class MatrixRowSum {
    public static void main(String[] args){
        int arr[][]={{3,4,11},{2,12,1},{7,8,7}};

        int row=arr.length;
        int col=arr[0].length;
        System.out.println("Max Row Sum :");
        int max1=rowSum(arr,row,col);
        System.out.println(max1);
        System.out.println("Max Col Sum :");
        int max2 =colSum(arr,row,col);
        System.out.println(max2);

    }

    private static int rowSum(int[][] arr, int row, int col) {
        int max =Integer.MIN_VALUE;
        for(int i =0;i<row;i++){
            int sum =0;
            for (int j=0;j<col;j++){
                sum+=arr[i][j];
            }
            if(max<sum){
                max=sum;
            }
//            System.out.println(i+"->"+sum);
        }
        return max;
    }
    private static int colSum(int[][] arr, int row, int col) {
        int max =Integer.MIN_VALUE;
        for(int i =0;i<row;i++){
            int sum =0;
            for (int j=0;j<col;j++){
                sum+=arr[j][i];
            }
            if(max<sum){
                max=sum;
            }
//            System.out.println(i+"->"+sum);
        }
        return max;
    }
}
