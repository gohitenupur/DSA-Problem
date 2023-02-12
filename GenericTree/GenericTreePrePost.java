package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTreePrePost {
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
        TraversePrePost(root);

    }

    private static void TraversePrePost(Node root) {
        if (root==null){
            System.out.println("Tree is empty");
        }
        System.out.println("Pre Node :"+root.data);
        for(Node child: root.children){
            System.out.println("Pre Edge :"+root.data+"--"+child.data);
            TraversePrePost(child);
            System.out.println("Post Edge :"+root.data+"--"+child.data);
        }
        System.out.println("Post Node :"+root.data);

    }
}
