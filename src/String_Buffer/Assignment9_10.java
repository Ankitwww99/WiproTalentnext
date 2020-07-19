package String_Buffer;
/*
Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.

Example1)
i/p:Wipro,3
o/p:propropro
 */
import java.util.Scanner;

public class Assignment9_10 {
    private static String lastNPattern(String str,int n){
        int len=str.length();
        StringBuffer res=new StringBuffer();

        for(int i=0;i<n;i++){
            res.append(str.substring(len-n));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split(",", 2);
        str = arr[0];
        int n = Integer.parseInt(arr[1]);
        System.out.println(lastNPattern(str,n));
    }
}
