package MatrixProgram;

public class PrintLikeAWave {
    public static void main(String[] args) {
        int [][]arr ={{1,2,3},{4,5,6},{7,8,9}};
        int row = arr.length;
        int col=arr[0].length;

        System.out.println("Print Wave :");
        for(int c=0;c<col;c++){
            if(c%2!=0){
                for(int r=row-1;r>=0;r--){
                    System.out.print(arr[r][c]+" ");
                }
            }else{
                for(int r=0;r<row;r++){
                    System.out.print(arr[r][c]+" ");
                }
            }
        }
    }
}
