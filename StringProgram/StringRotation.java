package StringProgram;

public class StringRotation {
//    Write a Code to check whether one string is a rotation of another

    public static void main(String[] args) {
        String str1 ="ABCD";
        String str2="CDAB";
        String temp =str1+str1;
        if(str1.length()!=str2.length()){
            System.out.println("Not a same length");
        }else{
            if(temp.contains(str2)){
                System.out.println("Rotated String");
            }else{
                System.out.println("Not Rotated");
            }
        }

    }
}
