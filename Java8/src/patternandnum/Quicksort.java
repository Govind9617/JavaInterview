package patternandnum;

import java.util.Arrays;

public class Quicksort {

    static void sorta(int[] a,int l,int h){
        int pivot=a[(l+h)/2];
        int i=l,j=h;
        while(i<=j){
        while(a[i]<pivot) i++;
        while (a[j]>pivot) j--;
        if(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        }
        if(l<j) sorta(a,l,j);
        if(i<h) sorta(a,i,h);
    }
    public static void main(String[] args) {
        int[] arr={2,5,4,3,8,9,6};
        sorta(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
