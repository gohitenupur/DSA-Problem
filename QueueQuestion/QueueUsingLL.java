package QueueQuestion;

public class QueueUsingLL {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class QueueLL{
        static  Node head =null;
        static  Node tail =null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            if(head==tail){
                tail=null;
            }
            int front =head.data;
            head=head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());

        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
