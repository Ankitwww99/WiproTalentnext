package String_Buffer;
/*
Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
 */
import java.util.Scanner;

public class Assignment9_5 {
    private static String strWithoutFirstLast(String s){
        int n=s.length();
        return s.substring(1,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(strWithoutFirstLast(str));
    }
}
