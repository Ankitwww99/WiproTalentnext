package Flow_Control_Statements;
/*
Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
Input format: a b
 */
import java.util.Scanner;

public class Assignment2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);

        if(c1>c2)
            System.out.println(c1+","+c2);
        else
            System.out.println(c2+","+c1);
    }
}
