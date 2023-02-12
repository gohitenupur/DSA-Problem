package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class MaxInGenericTree {
    private static class Node{
        int data ;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int maxNode(Node node){
        int max =Integer.MIN_VALUE; // smax variable
        if(node == null){  // root is empty
            return 0;
        }
        for(Node child : node.children){   // check all the child of root node
            int maxc =maxNode(child);
            max =Math.max(maxc,max);
        }
        max=Math.max(max,node.data); // check the root node
        return max; // return max

    }

    public static int size(Node node){
        int size =0;
        for(Node child : node.children){  // for all the child from root node
            int countSize=size(child);    // call recursion for every child of root
            size =size+countSize; // add to count
        }
        size=size+1;
        return size;

    }
    public static void main(String[] args){
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1}; // array

        Node root=null;
        Stack<Node> st =new Stack<>();
        for(int i =0;i< arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else{
                Node temp = new Node();
                temp.data=arr[i];

                if(st.size()>0){
                    st.peek().children.add(temp);
                }else{
                    root=temp;
                }
                st.push(temp);
            }
        }
        System.out.println(maxNode(root)+" ");
    }
}
