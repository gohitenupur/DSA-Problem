package BinaryTree;

public class CountOfNodes {
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
                return null;
            }
            Node newNode =new Node(nodes[idx]);
            newNode.left=buildNode(nodes);
            newNode.right=buildNode(nodes);

            return newNode;
        }

    }

    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree();
        Node root =bt.buildNode(nodes);
//        System.out.println(root.data);
        int count =countNodes(root);
        System.out.println("Total no of Count :"+count);
    }

    private static int countNodes(Node root) {
        if(root==null){
            return 0;
        }
        int leftNode =countNodes(root.left);
        int rightNode =countNodes(root.right);

        return leftNode+rightNode+1;


    }
}
