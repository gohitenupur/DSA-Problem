package Recursion;

public class Print1To5 {
    public static void main(String[] args) {
        incresing1To5(5);
    }

    private static void incresing1To5(int n) {
        // base case
        if(n==0){
            return;
        }
        //print
        incresing1To5(n-1); //recursion
        System.out.print(n+" ");


    }
}
