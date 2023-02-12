package SortingTechnique;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={3 ,5 ,7 ,9,8, 4};
        int target=8;
        boolean flag =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
                System.out.println("target found in position :"+i);
            }
        }
        if(flag==false){
            System.out.println(" Element Not Present ");
        }

    }
}
