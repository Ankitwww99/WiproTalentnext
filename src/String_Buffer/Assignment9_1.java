package String_Buffer;
/*
Write a Program to check whether a given String is Palindrome or not.
 */
import java.util.Scanner;

public class Assignment9_1 {
    private static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean res=isPalindrome(str);
        if(res)
            System.out.println(str+" is Palindrome");
        else
            System.out.println(str+" is not Palindrome");
    }


}
