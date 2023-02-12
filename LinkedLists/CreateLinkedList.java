package LinkedLists;


public class CreateLinkedList {
    static class Node{
        int data;
        Node next;
    }
    public static  class LinkList{
        Node head;
        Node tail;
        int size;

        void addLast(int data){
            Node temp = new Node();//first element
            temp.data=data; // set data
            temp.next=null; // set null
            if(size==0){
                head=tail=temp; // make head & tail point to temp
                       // increase the size
            }else{
                tail.next=temp; // sift the tail
                tail=temp;     // point tail to temp/new node //increase the size
            }
            size++;
        }
        public int sizeOfLL(){
            return size;
        }
        public void display(){
            Node curr = head;
            while (curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;

            }
        }



    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        System.out.println(ll.sizeOfLL());
        ll.display();
    }
}
