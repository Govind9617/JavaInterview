package patternandnum;

import java.util.Scanner;

public class pat2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter numbe");
        int n=scanner.nextInt();
        int spaces=20;
        int stars=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<spaces;j++){
                System.out.print("-");
            }
            for (int k=1;k<=stars;k++){
                if(k==1||k==stars||i==n){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
            spaces--;
            stars+=2;
        }
    }
}
