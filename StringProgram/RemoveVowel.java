package StringProgram;

import java.util.Scanner;

public class RemoveVowel {
//    public static void main(String[] args) {
//        String str1, str2;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a String : ");
//        str1 = scan.nextLine();
//        str2 = str1.replaceAll("[aeiouAEIOU]", "");
//        System.out.print(str2);

public static void main(String[] args) {
    String str ="my name is nupur";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o'
                || str.charAt(i)=='u' ||str.charAt(i)=='A' ||str.charAt(i)=='E' || str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U'){
            continue;
        }else{
            System.out.print(str.charAt(i));
        }
    }
}
}
