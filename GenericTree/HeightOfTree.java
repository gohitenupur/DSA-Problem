package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class HeightOfTree {
    private static class Node{
        int data ;
        ArrayList<Node> children = new ArrayList<>();
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
        int height=maxHeight(root);
        System.out.println(" height of Edges of tree : "+height); // edges means root node is at 0 postision
    }

    private static int maxHeight(Node root) {
        int height =-1; // edges means root node is at 0 postision
        for(Node child : root.children){
            int ch =maxHeight(child); // check childs of tree
            height=Math.max(height,ch); // count max height of child
        }
        height =height+1; // add the root of tree

        return height;
    }
}
