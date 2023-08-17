package patternandnum;

public class JaavSttring {
    static String rev(String s){
        String s1="";
        for (int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        String s="hi hello java";
        String[] s1=s.split(" ");
        for (int i=0;i<s1.length;i++){
//            System.out.print(rev(s1[i]+" "));
            System.out.println(s1[s1.length-1-i]);
        }


    }
}
