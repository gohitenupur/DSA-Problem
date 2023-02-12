package AssignmentWork;
// Question number -8
public class ToggledSentance {
    public static void main(String[] args) {
        String str="Welcome To School After Diwali Break";
        String words[]=str.split("\\s");
        String toggle="";
        for(String w:words){
            String first=w.substring(0,1); // only first character
            String afterfirst=w.substring(1); // other characters
            toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";
            // first letter lower case and other upper case;
        }
        System.out.println(toggle+" ");
    }
}
