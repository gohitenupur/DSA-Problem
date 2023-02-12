package AssignmentWork;

public class PrintPositiveNegetive {

    public static void main(String[] args) {
        int arr[]={-9,12,-3,-7,89,-34,15,16,-67,25};
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] <= 0) {
                j++;
            }
            else {
                for (int k = j; k > i; k--) {
                    int temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
                i++;
                j++;
            }
        }
        for(int var:arr){
            System.out.print(var+" ");
        }
    }
}
