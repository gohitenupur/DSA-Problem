package ArraysProgram;

public class MoveZeroInEnd {
    public static void main(String[] args) {
        int []arr ={2,0,4,6,0,0,4};
        int i=0;
        int j=0;
        int count =0;
        while(i<arr.length){
            if(arr[i]==0){
                count++;
                i++;
            }else{
                arr[j++]=arr[i++];
            }
        }
        for(int k=0;k<count;k++){
            arr[j++]=0;
        }
        for(int var:arr){
            System.out.print(var+" ");
        }
    }
}
