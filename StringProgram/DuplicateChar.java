package StringProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str="nupur";
//        Set<Character> st =new HashSet<>();
//        for (int i=0;i<str.length();i++){
//            if(st.contains(str.charAt(i))){
//                System.out.print(str.charAt(i)+" ");
//            }else{
//                st.add(str.charAt(i));
//            }
//
//        }




//        char ch[]=str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        int maxCount=0;
        char maxchar=' ';
        for(Map.Entry<Character,Integer> mm:map.entrySet()){
            if(maxCount<mm.getValue()){
                maxCount=mm.getValue();
                maxchar=mm.getKey();
            }
        }
        System.out.println(maxchar+" -> "+maxCount);

    }
}
