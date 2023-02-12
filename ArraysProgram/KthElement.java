package ArraysProgram;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthElement {
    public static void main(String[] args) {
        int arr[]={9,8,-3,6,7,2};
        int k = 3;

        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(arr[i]);
                break;
            }
        }

//        int li=0;
//        int hi =arr.length-1;
//        PriorityQueue<Integer> maxHeap=new PriorityQueue<>();
//        for(int i=li;i<=hi;i++){
//            maxHeap.add(arr[i]);
//            if(maxHeap.size()>k+1){
//                maxHeap.remove();
//            }
//        }
//        System.out.println(maxHeap.peek());




//        int arr[]={9,8,-3,6,7,2};
//        int idx = 3;
//        Arrays.sort(arr);
//        int res= arr[idx-1];
//        System.out.println(res);

    }
}
