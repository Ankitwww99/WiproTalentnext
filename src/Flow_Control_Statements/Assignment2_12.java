package Flow_Control_Statements;
/*
 Write a program to check if a given number is prime or not.
 */
public class Assignment2_12 {
    public static void main(String[] args) {
        int c=0;
        int n=Integer.parseInt(args[0]);
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
