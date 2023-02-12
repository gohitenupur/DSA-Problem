package SortingTechnique;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,3,5,1,7,0,-2,-5,9,6,5};
        int target=5;
        int low =0;
        int high =arr.length-1;
        boolean flag =false;
        int mid=low+(high-low)/2;
        if(low<high){
            if(arr[mid]==target){
                flag=true;
                System.out.println("Element is index "+mid);
            }else if(arr[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
            mid=low+(high-low)/2;
        }
        if(flag==false){
            System.out.println("Element not present");
        }
    }
}
