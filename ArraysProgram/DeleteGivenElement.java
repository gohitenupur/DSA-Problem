package ArraysProgram;

public class DeleteGivenElement {
    public static void main(String[] args) {
        int[] arr={10,20,13,30,40,50};
        int target =13;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int var:arr){
            System.out.print(var+" ");
        }
    }
}
