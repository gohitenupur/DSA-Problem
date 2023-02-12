package AssignmentWork;

import java.util.Arrays;
import java.util.Vector;

//Question No -11
public class LargestPrime {
    static void prime(int arr[], int n)
    {
        int max_val = Arrays.stream(arr).max().getAsInt();
        Vector<Boolean> prime = new Vector<Boolean>();
        for(int i= 0;i<max_val+1;i++)
            prime.add(Boolean.TRUE);

        prime.add(0, Boolean.FALSE);
        prime.add(1, Boolean.FALSE);
        for (int p = 2; p * p <= max_val; p++) {

            if (prime.get(p) == true) {

                // Update all multiples of p
                for (int i = p * 2; i <= max_val; i += p)
                    prime.add(i, Boolean.FALSE);
            }
        }
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (prime.get(arr[i])) {
                maximum = Math.max(maximum, arr[i]);
            }
        if(maximum==Integer.MIN_VALUE){
            System.out.println(arr[arr.length-1]);
        }else{
            System.out.println("Maximum : " + maximum );
        }
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;

        prime(arr, n);
    }
}
