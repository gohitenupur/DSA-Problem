package BinaryTree;

public class BinarySearchTree {
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
    private static Node insertNode(Node root,int val){  // time complaxity - O(n)
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
    private static boolean search(Node root,int key){   // time complaxity O(h)
        // base case
        if(root==null){
            return  false;
        }
        if(root.data>key){ // root node is greater then key value
            return search(root.left,key); // search in left
        }else if(root.data==key){
            return  true;               // key value found
        }else{
            return search(root.right,key);  // search in right subtree
        }
    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root = insertNode(root,value[i]);
        }
        inOrder(root);
        System.out.println();


        boolean val=search(root,4);
        if(val==true){
            System.out.println("value Found in tree");
        }else {
            System.out.println("Value not found in tree");
        }



    }
}
