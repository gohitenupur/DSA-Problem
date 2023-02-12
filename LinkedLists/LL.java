package LinkedLists;

public class LL {
    Node head;
    private int size;
    LL(){
        size=0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //add- first ,last
    public void  addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            size++;
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            size++;
            head=newNode;
            return;
        }
        Node curr =head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        size++;
    }
    public void display(){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public void deleteFirst(){
        if(head==null){
            size--;
            System.out.println("already empty list");
            return;
        }
        size--;
        head=head.next;

    }
    public void deleteLast(){
        if(head==null){
            size--;
            System.out.println("already empty list");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secLast =head;
        Node last=head.next;
        while (last.next!=null){
            last=last.next;
            secLast=secLast.next;
        }
        secLast.next=null;

    }
    public int getSizell(){
        return size;
    }


    public static void main(String[] args) {
        LL ll =new LL();

        ll.addFirst(10);
        ll.addFirst(50);
//        ll.addlast(20);
//        ll.addlast(30);
//        ll.addlast(40);
        ll.display();
//        System.out.println();
//        ll.deleteLast();
//        ll.display();



        System.out.println();
        System.out.println(ll.getSizell());


    }
}
