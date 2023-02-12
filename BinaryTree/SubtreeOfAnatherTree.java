package BinaryTree;

public class SubtreeOfAnatherTree {
    static  class Node{         // Node Class
        int data;
        Node left;
        Node right;
        Node(int data){      // constructor
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static  int idx=-1;
        public static Node buildNode(int[] nodes){

            idx++;
            if(nodes[idx]==-1){
                return new Node(-1);
            }
            Node newNode =new Node(nodes[idx]);
            newNode.left=buildNode(nodes);
            newNode.right=buildNode(nodes);

            return newNode;
        }

    }

    public static void main(String[] args) {
//        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//
//        int[] subnode ={3, -1, 6, -1, -1};
//
//
//        BinaryTree bt = new BinaryTree();
//
//        Node root=bt.buildNode(nodes);
//        Node subroot =bt.buildNode(subnode);
//
//        System.out.println(root.data);
//        System.out.println(subroot.data);
//
//        boolean isExist=subTree(root,subroot);
//
//        System.out.println(isExist);



    }
    private static boolean isIdentical(Node root ,Node subroot){
            if(root==null && subroot==null){
                return true;
            }
            if(root==null || subroot==null){
                return  false;
            }
            if(root.data==subroot.data) {
                return isIdentical(root.left, subroot.left) || isIdentical(root.right, subroot.right);
            }
            else return false;
    }

    private static boolean subTree(Node root,Node subroot) {
        if(subroot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
             if(isIdentical(root,subroot)){
                 return true;
             }
        }

       return subTree(root.left ,subroot) || subTree(root.right ,subroot);

    }
}
