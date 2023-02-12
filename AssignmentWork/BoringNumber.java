package AssignmentWork;

import java.util.HashMap;
import java.util.Map;

// Question No -12
public class BoringNumber {
    public static void main(String[] args) {
        int num=123456;
        int count = 0;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=count;i>0;i++){
            if (num != 0) {
                int rem = num % 10;
                num /= 10;
                mp.put(i,rem);
            }
        }
        boolean flag=true;
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getKey()==e.getValue()){
                continue;
            }else{
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("Given Num is Boring No :");
        }else{
            System.out.println("Given Num is Not a Boring No :");
        }

    }
}
