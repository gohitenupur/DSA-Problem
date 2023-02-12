package StringProgram;

import java.util.ArrayDeque;

import java.util.Deque;
import java.util.Scanner;

public class Main {
        public static String largestString(int n, int k, String sc)
        {
            char[] s = sc.toCharArray();
//            Arrays.sort(s);
            Deque<Character>deq = new ArrayDeque<>();
            for (int i = 0; i < n; ++i) {
                while (deq.size() >0 && deq.getLast() < s[i] && k>0) {
                    deq.poll();
                    k--;
                }
                deq.add(s[i]);
            }

            String st = "";
            for (char c : deq)
                st = st + Character.toString(c);
            return st;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str =sc.next();
        int k =sc.nextInt();

        String res = largestString(n, k, str);
        System.out.println(res);



    }
}
