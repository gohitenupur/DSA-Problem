package AssignmentWork;

import java.util.Scanner;

// Question no - 9
public class Overload {
    public  void series() {
        int s=0;
        for(int i=0;i<=20; i++){
            s= (int) (s+(i*1.0)/(i+1.0));

        }
        System.out.println();
        System.out.println("The Sum is"+s);
    }
    public static void series(int n){
        int n1=2,n2=3,sum=0,n3,i;
        sum=n1+n2;

        for(i=2;i<n;++i)//loop starts from 2 because 2 and 3 are already printed
        {
            n3=n1+n2;
            sum+=n3;
            n1=n2;
            n2=n3;
        }
        System.out.println();
        System.out.print("sum series(int n) :"+sum);

    }
    public static void series(int x,int n){
        double sum=0.0;
        for(int i = 0; i <= n; i++) {
            sum += Math.pow(x,i);
        }
        System.out.println();
        System.out.println("sum of the series : "+sum);

    }
    public static void main(String[] args) {
        Overload obj=new Overload();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int value =sc.nextInt();
        System.out.println("Enter the nth term :");
        int n =sc.nextInt();

        obj.series();
        obj.series(n);
        obj.series(value,n);

    }


}
