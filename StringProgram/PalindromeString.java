package StringProgram;

public class PalindromeString {
    public static void main(String[] args) {
        String str="nupur";
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        if(str.equals(rev)){
            System.out.println("Palindrome String ");
        }else{
            System.out.println("Not a Palindrome String");
        }

    }
}
