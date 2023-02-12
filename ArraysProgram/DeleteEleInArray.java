package ArraysProgram;

public class DeleteEleInArray {
    static  int count =6;
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};

        deleteEleEnd(arr);
        deleteEleAtPosition(arr,2);

        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void deleteEleAtPosition(int[] arr, int pos) {
        arr[pos]=0;
        count--;
        for(int i=pos;i<count;i++){
            arr[i]=arr[i+1];
        }

    }

    private static void deleteEleEnd(int[] arr) {
       int last=arr.length-1;
       arr[last]=0;
        count--;
    }
}
