package StringProgram;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 6;
        String res =sayCount(n);
        System.out.println(res);
    }

    private static String sayCount(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String str="11";
        for(int i=3;i<=n;i++){
            String temp="";
            int count=1;
            str=str+"$";
            for(int j=1;j<str.length();j++){
                if(str.charAt(j)!=str.charAt(j-1)){
                    temp = temp + String.valueOf(count);
                    temp=temp+str.charAt(j-1);
                    count=1;
                }else{
                    count++;
                }
            }
            str=temp;
        }
        return str;
    }
}
