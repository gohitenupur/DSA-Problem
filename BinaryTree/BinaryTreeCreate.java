package BinaryTree;

public class BinaryTreeCreate {
    // create the node structure (doubly node)
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    // for creating binary tree
    static class BinaryTree{
        static int idx =-1;  // take idx for travelsal one by one
        public static Node buildNode(int[] nodes){
            idx++;   // increase  the idx to 0th possition
            if(nodes[idx]==-1){    // check idx position
                return null;
            }
            Node newNode =new Node(nodes[idx]);  // make new node
            newNode.left=buildNode(nodes);      // for left subtree
            newNode.right=buildNode(nodes);     // for right subtree
            return newNode;                     // return the root node
        }

    }
    // travel the entire tree with preorder travelsal  root -> left ->right
    private static void preOrder(Node root){
        // base case
        if(root == null){
            return;
        }
        System.out.print(root.data+" "); // print
        preOrder(root.left); // left travalsal
        preOrder(root.right); // right travelsal

    }
    private static void inOrder(Node root) {
        // base case
        if(root==null){
            return;
        }
        inOrder(root.left); // left travel
        System.out.print(root.data+" "); // print
        inOrder(root.right); //right travel
    }

    private static void postOrder(Node root) {
        // base case
        if(root == null){
            return;
        }
        postOrder(root.left); // left  travel
        postOrder(root.right);// right travel
        System.out.print(root.data+" "); // print

    }
    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // create the object of binary tree
        BinaryTree bt=new BinaryTree();
        Node root =bt.buildNode(nodes); //calling the build node method return root node

        System.out.println("root node :"+root.data); // return root node

        System.out.println("PreOrder Travelsal :");
        preOrder(root);   //// calling the preorder travelsal
        System.out.println();


        System.out.println("InOrder Travelsal :");
        inOrder(root);  // // calling the in order travalsal
        System.out.println();


        System.out.println("PostOrder Travelsal :");
        // calling the post order travelsal
        postOrder(root);
    }




}
