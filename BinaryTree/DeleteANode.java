package BinaryTree;

public class DeleteANode {
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
        private static Node deleteNode(Node root ,int key){
            if(root.data>key){  // left
                root.left=deleteNode(root.left,key);
            } else if(root.data<key){ // right
                root.right=deleteNode(root.right,key);
            }else{  // root.data == key

                // case1 - leaf node
                if(root.left==null && root.right==null){
                    return  null;
                }
                // case 2 = only one child
                if(root.left==null){
                    return root.right;
                }else if(root.right==null){
                    return root.left;
                }

                // case 3 = both the child present in tree
                // search for left most successor in right of the deleting node
                Node IOS =inOrderSuccessor(root.right);
                root.data=IOS.data;      //insert the value of left most successor from the right
                root.right =deleteNode(root.right,IOS.data); //
            }
            return  root;

        }
        private static Node inOrderSuccessor(Node root){
            while (root.left!=null){  // delete the value of left most successor
                root =root.left;
            }
            return root;
        }
        public static void main(String[] args) {
            int value[] = {8,5,3,1,4,6,10,11,14};
            Node root = null;
            for (int i = 0; i < value.length; i++) {
                root = insertNode(root, value[i]);
            }
            inOrder(root);
            System.out.println();

            deleteNode(root,4);  // no child
            inOrder(root);
            System.out.println();

            deleteNode(root,10);   // one child
            inOrder(root);
            System.out.println();

            deleteNode(root,5);    // two children
            inOrder(root);
            System.out.println();



        }

    }
}
