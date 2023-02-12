package ArraysProgram;

public class InverseNum {
    public static void main(String[] args) {
        int n =426135;
        System.out.println("Original  number  " +n);
        int inv =0;
        int op =1;
        while(n!=0){
            int od =n%10;
            int id =op;  // id -inverse digit  // op - original position
            int ip =od;  // ip = inverse position // od -original digit

            // make change to inv using ip and id
            inv =inv+ id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println("inverse number  " +inv);
    }
}
