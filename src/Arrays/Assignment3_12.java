package Arrays;
/*
Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
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
