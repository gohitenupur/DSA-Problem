package StackQuestion;

import java.util.Scanner;
import java.util.Stack;

public class BreaketBallance {
    public static void main(String[]args) throws Exception {
//        Scanner sc = new Scanner(System.in);
        String str = "(a+b)+(c+d)";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println("Duplicate exists ->true");
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }

        }

        System.out.println("Duplicates not exists -false");

    }
}
