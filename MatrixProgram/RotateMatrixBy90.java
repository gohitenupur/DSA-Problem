package MatrixProgram;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int [][]arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        rotateBy90(arr);

    }

    private static void rotateBy90(int[][] arr) {
        int rowlen =arr.length;
        int collen =arr[0].length;
        for(int col =collen-1;col>=0;col--){
            for(int row =rowlen-1;row>=0;row--){
                System.out.print(arr[col][row]+" ");
            }
            System.out.println();
        }
    }
}
