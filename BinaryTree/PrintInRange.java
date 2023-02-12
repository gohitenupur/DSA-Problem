package BinaryTree;

import java.util.ArrayList;

public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;
        // constructor
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    private static Node insertNode(Node root, int val){  // time complaxity - O(n)
        if(root ==null){    // first node
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            // left subtree
            root.left=insertNode(root.left,val);
        }else{
            // right subtree
            root.right=insertNode(root.right,val);
        }
        return root;
    }
    private static void inOrder(Node root){   // time complaxity -O(n)
        // base case
        if(root==null){
            return;
        }
        inOrder(root.left);  // left subtree
        System.out.print(root.data+" "); // print
        inOrder(root.right);  //right subtree
    }
    private static void printRange(Node root ,int x,int y){
        // base case
        if(root==null){
            return;
        }
        // root node between the range
        if(root.data>=x && root.data<=y){  // between range
            printRange(root.left,x,y);  // left
            System.out.print(root.data+"  ");
            printRange(root.right,x,y);  //right
        }
        //
        else if(root.data>y){
            printRange(root.left,x,y);
        }else{
            printRange(root.right,x,y);
        }


    }
    private static void print2Leaf(Node root , ArrayList<Integer> path){
        if(root==null){   // base case
            return;
        }
        path.add(root.data);
        // leaf node
        if(root.left==null && root.right==null){
            printPath(path);
        }else {
            print2Leaf(root.left, path);
            print2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    private static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root = insertNode(root,value[i]);
        }
        System.out.println("Tree Nodes  :");
        inOrder(root);
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Print In range between 6-10 :");
        printRange(root,6,10);
        System.out.println();
        System.out.println("--------------------------------------------");

        System.out.println("Root to leaf Path :");
        ArrayList<Integer> path =new ArrayList<>();
        print2Leaf(root,path);




    }
}
