package ArraysProgram;

import java.util.Scanner;

public class AddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit=sc.nextInt();
        int num =0,sum=0;

        for(int i=1;i<=digit;i++){
            int temp=sc.nextInt();
            sum+=temp;
            num=num*10+temp;
        }
        System.out.println(num);
        System.out.println(sum);

    }
}
