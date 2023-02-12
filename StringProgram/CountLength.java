package StringProgram;

public class CountLength {
    public static void main(String[] args) {
        String str ="helloworld";
        int len = str.length();
        System.out.println("Function length :"+len);
        int count =0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            count++;
        }
        System.out.println("Total Count :"+count);

    }
}
