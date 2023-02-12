package Recursion;

public class Print5to1And1to5 {
    public static void main(String[] args) {
        printDecresingIncresing(5);
    }

    private static void  printDecresingIncresing(int n) {
        // base case
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDecresingIncresing(n-1);
        System.out.print(n+" ");

    }
}
