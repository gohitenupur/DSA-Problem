package StringProgram;

public class ValidSuffle {
    public static void main(String[] args) {
        String s1="xyz";
        String s2="12";
        String res ="x1y2z";
        String temp =chechValidSuffle(s1,s2,res);
        System.out.println(temp);
    }

    private static String chechValidSuffle(String s1, String s2, String res) {
        int len1 =s1.length();
        int len2=s2.length();
        int reslen=res.length();
        if(len1+len2!=reslen){
            return "No";
        }else{
            int i=0;
            int j=0;
            int k=0;
            int flag=0;
            while (k<reslen){
                if(i<len1 && s1.charAt(i)==res.charAt(k))
                    i++;
                else if(j<len2 && s2.charAt(j)==res.charAt(k))
                    j++;
                else {
                    flag=1;
                    break;
                }
                k++;
            }
            if(flag==1) return "No";
            else return "Yes";
        }
    }
}
