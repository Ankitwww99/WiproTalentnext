package String_Buffer;
/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
 */
import java.util.Scanner;

public class Assignment9_7 {
    private static String withoutX(String str){

        if(str.charAt(0)=='x')
            return str.substring(1);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(withoutX(str));
    }
}
