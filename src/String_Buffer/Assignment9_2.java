package String_Buffer;
/*
Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate
 */
import java.util.Scanner;

public class Assignment9_2 {
    private static String strConcatenation(String a,String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.charAt(a.length()-1)==b.charAt(0))
            return a+b.substring(1);
        return a+" "+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split(",", 2);

        System.out.println(strConcatenation(arr[0],arr[1]));
    }
}
