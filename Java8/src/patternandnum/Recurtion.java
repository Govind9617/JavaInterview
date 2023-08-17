package patternandnum;

public class Recurtion {
    static void m1(int n){
       if(n==10)return;
        System.out.println(n);
        m1(n+1);
    }
    static int fact(int n){
        if(n==0||n==1) return 1;
       return n*fact(n-1);
    }

    public static void main(String[] args) {
//        m1(1);
        int n=fact(5);
        System.out.println(n);
    }
}
