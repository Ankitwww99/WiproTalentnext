package Flow_Control_Statements;
/*
 Write a program to print prime numbers between 10 and 99.
 */
public class Assignment2_13 {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=10;i<=99;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
