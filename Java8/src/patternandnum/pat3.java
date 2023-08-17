package patternandnum;

import java.util.Scanner;

public class pat3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter numbe");
        int n=scanner.nextInt();
        int spaces=20;
        int stars=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print("-");
            }
            for (int k=1;k<=stars;k++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
            spaces--;stars+=2;
            }else {
                spaces++;stars-=2;
            }
        }

    }
}
