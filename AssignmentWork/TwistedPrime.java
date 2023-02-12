package AssignmentWork;

public class TwistedPrime {
    public static void main(String[] args) {
        int rev;
        int count1;
        int count2;
        int rem;

        for(int i=10;i<=99;i++){ // two digit 10-99

            count1=0;
            for(int j=1;j<=i;j++)  //find prime no
            {
                if(i%j==0) // value is only divide by 1 or itself
                    count1++; //if count ==2 so its prime no
            }
            rev=0;
            for(int j=i;j>0;j/=10)
            {
                rem=j%10; // contain last value
                rev=rev*10+rem; // multiply with 10
            }
            count2=0;
            for(int j=1;j<=rev;j++)
            {
                if(rev%j==0) // rev value count is also 2 then its twisted prime
                    count2++;
            }
            if(count1==2 && count2==2) {
                System.out.print(i +" "); // print twisted prime
            }

        }
    }
}
