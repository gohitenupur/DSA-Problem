package GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderOfGT {
    private static class Node{
        int data;
        ArrayList<Node> children =new ArrayList<>();
    }
    public static void display(Node node){
        String str = node.data+"->";
        //System.out.print(node.data+"->");
        for(Node child: node.children){
            str +=child.data+" ";
//            System.out.print(child.data+" ");
        }
        str+=".";
        System.out.println(str);
//        System.out.println();

        // faith ye h ki 20,30,40, will print themselves and there family
        for (Node child:node.children){
            display(child);
        }

    }

    public static void main(String[] args) {
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1}; // array
        Node root =null;
        Stack<Node> st = new Stack<>();
        for(int i=0; i<arr.length;i++){ // traverse throughout the array
            if(arr[i]==-1){  // arr contain -1
                st.pop();    // delete from stack

            }else{           // push in stack
                Node temp = new Node(); // make new node
                temp.data =arr[i];      // add data to node

                if(st.size()>0){  // stack have element
                    st.peek().children.add(temp);  // add element to the children
                    st.push(temp);                 // push in the stack
                }else{
                    st.push(temp);// stack is empty
                    root =temp;
                }

            }
        }
//        display(root);
//        printLevelOrder(root);
//        printLevelOrderWithToQ(root);
        printZigZag(root);
    }

    private static void printZigZag(Node root) {
        Stack<Node> ms=new Stack<>();
        ms.push(root);
        Stack<Node> cs=new Stack<>();
        int level=1;
        while (ms.size()>0){
            root =ms.pop();
            System.out.print(root.data+" ");

            if(level%2==1){
                for(int i=0;i<root.children.size();i++){
                    Node child = root.children.get(i);
                    cs.push(child);
                }
            }else{
                for(int i =root.children.size()-1;i>=0;i--){
                    Node child =root.children.get(i);
                    cs.push(child);
                }
            }
            if(ms.size()==0){
                ms=cs;
                cs=new Stack<>();
                level++;
                System.out.println(".");
            }
        }
    }

    private static void printLevelOrderWithToQ(Node root) {
        Queue<Node> mq=new ArrayDeque<>();
        mq.add(root);
        Queue<Node> cq=new ArrayDeque<>();
        while (mq.size()>0){
            root=mq.remove();
            System.out.print(root.data+" ");

            for (Node child:root.children){
                cq.add(child);
            }

            if (mq.size()==0){
                mq=cq;
                cq=new ArrayDeque<>();
                System.out.println(".");
            }
        }
    }

    private static void printLevelOrder(Node root) {

        // level Order - Remove , Print , add (rpa)
        Queue<Node> q =new ArrayDeque<>();
        q.add(root);

        while (q.size()>0){
            root=q.remove();
            System.out.print(root.data+"  ");

            for(Node child:root.children){
                q.add(child);
            }
        }
        System.out.print(".");

    }
}
