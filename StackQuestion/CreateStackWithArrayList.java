package StackQuestion;

import java.util.ArrayList;

public class CreateStackWithArrayList {
    public static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        // stack is empty
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            // get top ele with the help of size-1 and store it in variable
            int top =list.get(list.size()-1);
            list.remove(list.size()-1); // remove the size-1 position variable
            return top; // return the size-1 th variable
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1); // return size-1 th position variable
        }


    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()){
            System.out.print(s.peek()+" ->");
            s.pop();
        }
    }
}
