package StackQuestion;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        Stack<Integer> nst=new Stack<>();  // take new stack

        while(!st.isEmpty()){   // loop till old stack is empty
            int top =st.pop();  // pop from first stack
            nst.push(top);      // push it on new stack
        }

        System.out.println("After reverse");
        while (!nst.isEmpty()){
            System.out.print(nst.peek()+" ");
            nst.pop();
        }
    }
}
