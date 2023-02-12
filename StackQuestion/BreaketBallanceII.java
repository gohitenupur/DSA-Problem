package StackQuestion;

import java.util.Stack;
//https://www.youtube.com/watch?v=uuE2pEjLiEI&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=5
public class BreaketBallanceII {
    public static boolean clossingHendler(Stack<Character> st,char ch){
        if(st.size()==0){  // more closing brackets
            return false;
        }else if(st.peek()!=ch){    // opening and closing don't match
            return false;
        }else{
            st.pop();          // pop breakets
            return true;
        }
    }
    public static void main(String[] args) {
        String str = "(a+b)+(a-b)";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){ // push all opening brackets
                st.push(ch);
            }else if(ch==')'){
                boolean val =clossingHendler(st,ch);
                if(val == false){
                    System.out.println("false");
                    return;
                }
            }else if(ch=='}'){
                boolean val =clossingHendler(st,ch);
                if(val == false){
                    System.out.println("false");
                    return;
                }
            }else if(ch==']'){
                boolean val =clossingHendler(st,ch);
                if(val == false){
                    System.out.println("false");
                    return;
                }
            }
        }
        if(st.size()==0){
            System.out.println("true"); // stack is balanced
        }else {
            System.out.println("false");   // more opening brackets
        }
    }
}
