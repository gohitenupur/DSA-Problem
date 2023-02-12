package QueueQuestion;

public class QueueUsingArray {
    static class QueueA{
        static int arr[];
        static  int size;
        static int rear=-1;
        QueueA(int size){
            this.size=size;
            arr = new int[size];
        }
        // empty case
        public static boolean isEmpty(){
            return rear== -1;
        }
        // enque or add element
        public static void add(int data){
            // base case
            if(rear==size-1){
                System.out.println("Queue is full :" );
                return;
            }
            rear++;
            arr[rear]=data;

        }
        // dequeue or remove O(n)
        public static int remove(){
            // base case
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue :");
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        QueueA q = new QueueA(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
