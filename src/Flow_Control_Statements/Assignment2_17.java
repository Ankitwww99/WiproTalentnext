package Flow_Control_Statements;
/*
 Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
 */
public class Assignment2_17 {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        if(isPrime(n))
            System.out.println(n+" is a palindrome");
        else
            System.out.println(n+" is not a palindrome");
    }
}
