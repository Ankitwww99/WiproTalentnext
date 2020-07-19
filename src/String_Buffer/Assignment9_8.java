package String_Buffer;
/*
Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
 */
import java.util.Scanner;

public class Assignment9_8 {
    private static String withoutCharXChar(String str){
        int indOfX=str.indexOf("*");
        if(indOfX!=-1)
            return str.substring(0,indOfX-1)+ str.substring(indOfX+2);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(withoutCharXChar(str));
    }
}
