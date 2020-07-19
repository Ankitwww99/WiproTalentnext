package String_Buffer;
/*
Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
 */
import java.util.Scanner;

public class Assignment9_6 {
    protected static String sLs(String a,String b){
        int len_a=a.length();
        int len_b=b.length();

        if(len_b<len_a)
            return b+a+b;
        return a+b+a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(sLs(a,b));
    }
}
