package StringProgram;

public class CopyProgram {
    public static void main(String[] args) {
        String str ="Helloworld";

        String newStr="";
        for (int i=0;i<str.length();i++){
            newStr=newStr+str.charAt(i);
        }
        System.out.println("Copy in new string :"+newStr);

    }
}
