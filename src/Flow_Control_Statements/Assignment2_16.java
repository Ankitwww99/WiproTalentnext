package Flow_Control_Statements;
/*
Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  *
*  *  *
 */
import java.util.Scanner;

public class Assignment2_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        while(n>0){
            r=r*10 + n%10;
            n=n/10;
        }
        System.out.println(r);
    }
}
