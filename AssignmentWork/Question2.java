package AssignmentWork;

public class Question2 {

    public static int maxValue(int obj1,int obj2){
        if(obj1>obj2){
            return obj1;
        }else{
            return obj2;
        }
    }
    public static void main(String[] args) {
        Members obj1=new Members(10,20);
        Members obj2=new Members(20,30);
        obj1.display();
        obj2.display();
        int val1 =obj1.getSum();
        System.out.println("Sum of object 1 variable :"+val1);
        int val2 =obj2.getSum();
        System.out.println("Sum of object 2 variable :"+val2);
        int max=maxValue(val1,val2);
        System.out.println("Maximum value of sums is : "+max);

    }
}
