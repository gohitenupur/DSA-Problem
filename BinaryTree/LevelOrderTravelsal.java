package BinaryTree;

import java.util.*;

public class LevelOrderTravelsal {
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
    static class  BinaryTree{
        static  int idx =-1;  // variable that travals all the array
        public static Node buildNode(int[] nodes){
            //base case
            idx++;
            if(nodes[idx]==-1){   // check idx base case
                return null;
            }
            Node newNode = new Node(nodes[idx]);   // create new node and put that on tree
            newNode.left=buildNode(nodes);   // travel left
            newNode.right=buildNode(nodes);  // travel right
            return newNode;                  // return
        }
    }
    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree(); // obj of binary tree
        Node root = bt.buildNode(nodes);  // calling build node and

//        System.out.println(root.data); // root node print

        System.out.println(" Level Order Travelsal :");
        levelOrder(root);



    }

    private static void levelOrder(Node root) {
        // base case
        if(root== null){
            return;
        }

        Queue<Node> q = new LinkedList<>(); // create queue for traveling the tree

        q.add(root);   // put insert element in queue
        q.add(null);   // then insert null        // q= root ,null

        while(!q.isEmpty()){ // check q is not empty
            Node currNode =q.remove();   // remove from q for print
            if(currNode==null){
                System.out.println();     // for next line
                if(q.isEmpty()){         // for last element
                    break;
                }else {
                    q.add(null);     // add null at the end
                }

            }else {
                System.out.print(currNode.data+" "); // print node
                if(currNode.left!=null){          // travel left part
                    q.add(currNode.left);               // add value in left value in queue
                }
                if(currNode.right!=null){       // travel right part
                    q.add(currNode.right);             // add value in left value in queue
                }
            }
        }
    }
}
