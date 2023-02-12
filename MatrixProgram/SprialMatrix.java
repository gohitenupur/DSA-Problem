package MatrixProgram;

public class SprialMatrix {
    public static void main(String[] args) {
        int [][]arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int row =arr.length;
        int col =arr[0].length;

        int top=0;
        int down=row-1;
        int left =0;
        int right=col-1;
        int count =0;
        int total =row*col-1;

        while (count<total){
            // for left to right
            for(int idx =0;count<total && idx<=right;idx++){
                System.out.print(arr[top][idx]+" ");
                count++;
            }
            top++;
            for(int idx =top;count<total && idx<=down;idx++){
                System.out.print(arr[idx][right]+" ");
                count++;
            }
            right--;
            for(int idx=right;count<total && idx>=left;idx--){
                System.out.print(arr[down][idx]+" ");
                count++;
            }
            down--;
            for(int idx =down;count<total && idx>top;idx--){
                System.out.print(arr[idx][left]+" ");
            }
            left++;
        }
    }
}
