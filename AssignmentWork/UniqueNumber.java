package AssignmentWork;

import java.util.Scanner;

// Question No - 10
public class UniqueNumber {

        public static void main(String args[] )
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number you want to check:");
            int number=sc.nextInt();
             //converts integer data type into string
            String str= Integer.toString(number);
            int length=str.length();
            int flag=0, i, j;
            for(i=0;i<length-1;i++)
            {
                for(j=i+1;j<length;j++)
                {
                     //if digits are repeated the number is not unique
                    if(str.charAt(i)==str.charAt(j))
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0)
                System.out.println("The number is unique.");
            else
                System.out.println("The number is not unique.");
        }
    }


