package String_Buffer;
/*
Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod
 */
import java.util.Scanner;

public class Assignment9_9 {
    private static String ababPattern(String a,String b){
        int len_a=a.length();
        int len_b=b.length();

        int len=len_a<len_b?len_a:len_b;

        StringBuffer sb=new StringBuffer();
        int i=0;

        while(i<len){
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
            i++;
        }

        sb.append(a.substring(len));
        sb.append(b.substring(len));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split(",", 2);
        System.out.println(ababPattern(arr[0], arr[1]));

    }
}
