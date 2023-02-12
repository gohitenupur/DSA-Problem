package StringProgram;

public class ReverseString {
    public static void main(String[] args) {
//        String name ="nupur";
//        String rev =" ";
//        for(int i=0;i<name.length();i++){
//            rev=name.charAt(i)+rev;
//        }
//        System.out.println(rev);


        String name ="nupur";
//        System.out.println("Original String :"+name);
        char ch[]=name.toCharArray();
        int low =0;
        int high =name.length()-1;
        while (low<high){
            char temp =ch[low];
            ch[low]=ch[high];
            ch[high]=temp;
            high++;
            low--;
        }
        System.out.println(new String(ch));
    }
}
