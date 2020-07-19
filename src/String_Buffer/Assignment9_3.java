package String_Buffer;
/*
Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
 */
import java.util.Scanner;

public class Assignment9_3 {
    private static String first2nTimes(String s){
        int len=s.length();
        if(len<2)
            return "Minimum input string length is 2";
        StringBuffer res=new StringBuffer();
        for(int i=0;i<len;i++){
            res.append(s.substring(0,2));
        }
        return  res.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(first2nTimes(str));

    }
}
