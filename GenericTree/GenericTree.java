package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {
    private static class Node{
        int data;
        ArrayList<Node> children =new ArrayList<>();
    }
    // root 10 will print itself and its family 10-> 20,30,40,
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
    public static int size(Node node){
        int count =0;
        for(Node child : node.children){  // for all the child from root node
            int countSize=size(child);    // call recursion for every child of root
            count =count+countSize; // add to count
        }
        count=count+1; // add 1 for root
        return count;   // return size
    }
    public static void main(String[] args) {
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1}; // array
        Node  root=null; // root or parent of all node
        Stack<Node> st =new Stack<>(); //stack
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
        display(root);

        System.out.println("size of tree :"+size(root));

    }
}
