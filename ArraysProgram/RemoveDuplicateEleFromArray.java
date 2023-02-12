package ArraysProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateEleFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,4,5,5,7,9,8};
        boolean isDuplicateExits=false;
        Set<Integer> uniqueNo=new HashSet<Integer>();

        for (int i=0;i<arr.length;i++){
            if(uniqueNo.contains(arr[i])){
                isDuplicateExits=true;
            }else {
                uniqueNo.add(arr[i]);
            }
        }
        if(!isDuplicateExits){
            System.out.println(-1);
        }
        System.out.println(uniqueNo);
    }
}
