package Arrays;

import java.util.Scanner;

public class Assignment3_12 {
    public static int[] middleWay(int[] a,int[] b){
        int[] mid=new int[2];
        mid[0]=a[1];
        mid[1]=b[1];
        return mid;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        System.out.println("Enter element of array a:");
        for (int i = 0; i < 3; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element of array b:");
        for (int i = 0; i < 3; i++) {
            b[i]=sc.nextInt();
        }
        int[] mid=middleWay(a,b);
        for (int i = 0; i < 2; i++) {
            System.out.print(mid[i]+" ");
        }
    }
}
