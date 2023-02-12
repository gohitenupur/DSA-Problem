package ArraysProgram;
import java.util.Scanner;
public class ContestQuestion
{
    // Priyanka And Her Crush (C program)
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int temp;
        int count = 0;
        int mid;
        int start = 0;
        int end;
        int z = 0;
        int t = sc.nextInt();
        while (t--!=0)
        {
            count = 0;
            start = 0;
            String str = sc.next();
            char a[]=str.toCharArray();
            i = 0;
            count=a.length;
            i=a.length;
            end = count - 1;
            start = 0;
            mid = count / 2;
            count = 0;
            temp = 0;
            while (a[start]< a[mid])
            {

                if (a[start] == a[end])
                {
                    start++;
                    end--;
                }

                else
                {
                    if (a[start] > a[end])
                    {
                        temp = a[start]- a[end];
                        count = count + temp;
                        start++;
                        end--;

                    }

                    else if (a[end] > a[start])
                    {
                        temp = a[end] - a[start];
                        count = count + temp;
                        start++;
                        end--;
                                                         }
                }
            }

            System.out.println(count);

        }

    }
}

