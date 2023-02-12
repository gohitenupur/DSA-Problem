package QueueQuestion;

public class CircularQueueUsingArray {
    static class QueueC{
        static int arr[];
        static  int size;
        static int rear=-1;
        static  int front =-1;
        QueueC(int size){
            this.size=size;
            arr = new int[size];
        }
        //circular queue is full
        public static boolean isFull(){
            return  (rear+1)%size==front;
        }
        // empty case
        public static boolean isEmpty(){
            return rear== -1 && front==-1;
        }
        // enque or add element
        public static void add(int data){
            // base case
            if(isFull()){
                System.out.println("Queue is full :" );
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        // dequeue or remove O(n)
        public static int remove(){
            // base case
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue :");
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        QueueC q = new QueueC(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(6);
        q.add(7);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
