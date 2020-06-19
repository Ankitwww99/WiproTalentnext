package Flow_Control_Statements;
/*
Write a program to print the sum of all the digits of a given number.

Example1)
I/P:1234
O/P:10
 */
import java.util.Scanner;

public class Assignment2_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(sum=0;n>0;n=n/10){
            sum+=n%10;
        }
        System.out.println(sum);
    }
}
