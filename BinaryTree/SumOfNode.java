package BinaryTree;

public class SumOfNode {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        private static int idx=-1;
        public static Node buildNode(int []nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildNode(nodes);
            newNode.right=buildNode(nodes);
            return  newNode;
        }

    }
    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree();
        Node root= bt.buildNode(nodes);

        int sum = sumOfNode(root);
        System.out.println("Sum of Node :"+ sum);


    }

    private static int sumOfNode(Node root) {
        if(root==null){
            return 0;
        }
        int left_sum =sumOfNode(root.left);
        int right_sum =sumOfNode(root.right);

        return left_sum+right_sum+root.data;
    }
}
