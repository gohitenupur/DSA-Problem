package ArraysProgram;

import java.util.*;

public class CountDuplicateElement {
    public static void main(String[] args) {
//        int [] arr ={1,1,2,2,3,4,4,8,9,1};
//        int count =0;
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]==arr[i+1]){
//                count ++;
//                System.out.print(arr[i]+" ");
//            }
//        }
//        System.out.println();
//        System.out.println(count);








//        int[] arr ={1,1,2,2,3,4,4,8,9,1};
//        Set<Integer> uniqueNo=new HashSet<Integer>();
//        boolean isDuplicateExit =false;
//        int count =0;
//
//        for(int i = 0;i<arr.length; i++){
//            if(uniqueNo.contains(arr[i])){
//                isDuplicateExit =true;
//                count++;
//                System.out.print(arr[i]+" ");
//            }else{
//                uniqueNo.add(arr[i]);
//            }
//        }
//        if(!isDuplicateExit){
//            System.out.println(-1);
//        }
//        System.out.println();
//        System.out.println(count);


        int [] arr ={1,1,2,2,3,4,4,8,9,1};
        Map<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for (int key:map.keySet()){
        System.out.print(key+"-"+ map.get(key)+" ");
        }
        System.out.println(Collections.singleton(map));

        System.out.println(map.keySet());
        System.out.println(map.values());



    }

}
