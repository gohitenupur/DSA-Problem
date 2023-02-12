package MatrixProgram;

public class BinarySearch {
    public static void main(String[] args) {
        int [][] arr ={{1,11,111,1111},{2,22,222,2222},{3,33,333,3333}};
        int row =arr.length;
        int col =arr[0].length;

        int target=33333;

        int element =BinarySearchII(arr,target,row,col);
        if(element==1){
            System.out.println("Element found ");
        }else{
            System.out.println("Element not found ");
        }

    }

    private static int BinarySearchII(int[][] arr, int target, int row, int col) {
        int rowIdx=0;
        int colIdx=col-1;

        while (rowIdx<row && colIdx>=0){
            int ele =arr[rowIdx][colIdx];
            if(ele==target){
                return 1;
            }else if(ele<target){
                rowIdx++;
            }else {
                colIdx--;
            }

        }
        return 0;
    }
}
