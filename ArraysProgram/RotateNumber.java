package ArraysProgram;

public class RotateNumber {
    public static void main(String[] args) {
        int n=12343356;
        System.out.println("Original Number "+n );
        int k=3;
//        length of number
        int temp =n;
        int nod=0;
        while(temp>0){
            temp = temp /10;
            nod++;
        }

        k=k%nod; // when k is greater then number (n)

        if(k<0){
            k=k+nod ;  // when k is -ve
        }
        // Rotation of no
        int div =1;
        int mult =1;
        for(int i=1;i<nod;i++){
            if(i<=k) {
                div = div * 10;
            }else{
                mult =mult*10;
            }
        }

        int q = n/div;
        int r =n%div;

        int rNum =r *mult +q;
        System.out.println("Rotate No is "+rNum );


    }
}
