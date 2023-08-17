package patternandnum;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("add numebr");
        int n=scn.nextInt();
        int m=0;
        while (n>0){
          m=(m*10)+(n%10);
          n/=10;
        }
        System.out.println(m);
    }
}
