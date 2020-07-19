package String_Buffer;
/*
 Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null
 */
import java.util.Scanner;

public class Assignment9_4 {
    private static String halfStr(String s){
        int n=s.length();
        if(n%2!=0)
            return null;
        return s.substring(0,n/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(halfStr(str));
    }
}
