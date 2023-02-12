package BinaryTree;

public class HeightOfNode {
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
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

       BinaryTree bt = new BinaryTree();
       Node root = bt.buildNode(nodes);


       //
        int height=heightOfNode(root);
        System.out.println("Height of Nodes :"+height);


        int diameter =diameterOfNodes(root);
        System.out.println("Diameter of Nodes :"+diameter);

    }

    private static int diameterOfNodes(Node root) {
        // base case
        if(root==null){
            return 0;
        }
        int dia_left=diameterOfNodes(root.left); // left travelsal
        int dia_right=diameterOfNodes(root.right); // right travelsal
        int dia =heightOfNode(root.left)+heightOfNode(root.right)+1; // for calcutating height and return max

        return Math.max(dia,Math.max(dia_left,dia_right)); // return max distance of node
    }

    private static int heightOfNode(Node root) {
        if(root==null){
            return 0;
        }
        int leftHeight =heightOfNode(root.left);
        int rightHeight=heightOfNode(root.right);

        int maxHeight=Math.max(leftHeight,rightHeight)+1;
        return maxHeight;
    }
}
