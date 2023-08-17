package patternandnum;

import java.util.Scanner;

public class RevString {
    static String rev(String s){
        String s1="";
        for (int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
    static boolean isPal(String s){
        s=s.toLowerCase();
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter ");
        String s=scn.next();
//        System.out.println(rev(s));
        System.out.println(isPal(s));
    }
}
