package ArraysProgram;

public class DeleteEleKPosition {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        int pos=2;
        int len = arr.length-1;
        for(int i=pos;i<len;i++){
            arr[i]=arr[i+1];
        }
        len--;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
