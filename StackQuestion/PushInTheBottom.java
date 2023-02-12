package StackQuestion;


import java.util.Stack;
// push at the bottom and reverse function
public class PushInTheBottom {
    public static void pushAtBottom(int data ,Stack<Integer> s){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushAtBottom(data,s);
        s.push(top);

    }
    public static void reverse(Stack<Integer> s){
        // base case
        if(s.isEmpty()){
            return;
        }
        int top =s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        pushAtBottom(5,s);

        reverse(s);
        System.out.println("After Reverse :");
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
}
