package BinaryTree;

public class DiameterOfTree {
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
    static class BinaryTree{   // creating Binary tree
        static  int idx=-1;   // index travel the whole node
        public static Node buildNode(int[] nodes){
            idx++;
            if(nodes[idx]==-1){    // check node empty
                return null;
            }
            Node newNode =new Node(nodes[idx]);  // create node
            newNode.left=buildNode(nodes);      // left
            newNode.right=buildNode(nodes);     // right

            return newNode;
        }

    }
    public static class TreeInfo{    // to store height and diameter of tree
        int height;
        int diam;
        TreeInfo(int height,int diam){
            this.height=height;
            this.diam=diam;
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildNode(nodes);


        // Calling the calculateDiameter function and store values in treeinfo
        TreeInfo tr =calculateDiameter(root);
        System.out.println(" Height of Tree is : "+tr.height);
        System.out.println(" Diameter of Tree is : "+tr.diam);

    }

    private static TreeInfo  calculateDiameter(Node root) {
        // base case
        if(root==null){                            // check for empty node
            return new TreeInfo(0,0);
        }

        TreeInfo left =calculateDiameter(root.left);   // left
        TreeInfo right =calculateDiameter(root.right);  // right

        int ht = Math.max(left.height,right.height)+1;   // calculate height
        int dia1 =left.diam;                             // left child
        int dia2=right.diam;                             // right child
        int dia3 =left.height+right.height+1;          // calculate height

        int maxDia=Math.max(Math.max(dia1,dia2),dia3);   // calculate diameter
        TreeInfo ti=new TreeInfo(ht,maxDia);            // store info in tree
        return ti;                                     // return tree object
    }
}
