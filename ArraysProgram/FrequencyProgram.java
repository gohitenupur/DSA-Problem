package ArraysProgram;

import java.util.*;

public class FrequencyProgram {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 3, 3, 3, 4, 4,4,4,4};


        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        int third_Max = Integer.MIN_VALUE;
        int maxres = 0;
        int secmaxres = 0;
        int thirdmaxres = 0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            int ele=e.getValue();
            if(max<ele){
                third_Max=sec_max;
                sec_max=max;
                max =ele;
                maxres=e.getKey();
            }else if(max>ele && ele>sec_max){
                third_Max=sec_max;
                sec_max=ele;
                secmaxres=e.getKey();
            }else if(sec_max>ele && ele>third_Max){
                third_Max=ele;
                thirdmaxres =e.getKey();
            }
        }

        System.out.println("Max :" + maxres);
        System.out.println("Sec Max :" + secmaxres);
        System.out.println("Third Max :" + thirdmaxres);
    }
}


