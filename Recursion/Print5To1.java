package Recursion;

public class Print5To1 {
    public static void main(String[] args) {
        int n=5;
        decresingNValue(n);
    }

    private static void decresingNValue(int n) {
        //base case
        if(n==0){
            return;
        }
        //kaam -print
        System.out.print(n+" ");
        decresingNValue(n-1); //Recursion


    }
}
