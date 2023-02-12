package StackQuestion;
// Stack using Array ,ArrayList, & Linkedlist
// Time Complexity
//push -O(1)
// pop -O(1)
//peek -O(1)
public class CreateStackLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        public static Node head;
        // stack is empty condition
        public static boolean isEmpty(){
            return head ==null;
        }
        // push opration using LL
        public static void push(int data){
            Node newNode =new Node(data);
            //when stack is empty
            if(isEmpty()){
                head =newNode; // make head to newnode
                return;
            }
            newNode.next=head; // newNode->next pointing to head
            head=newNode;      // make newNode as head -(add in the first)
        }
        public static int pop(){
            // empty condition
            if(isEmpty()){
                return -1;
            }

            int top =head.data;   // remove the head and make head->next as head
            head=head.next;
            return top;
        }
        public static int peek(){
            // empty condition
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()){
            System.out.print(s.peek()+" ->");
            s.pop();
        }


    }


}
