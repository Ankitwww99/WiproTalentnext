package Flow_Control_Statements;
/*
B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
 */
public class Assignment1B {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        if(x%10==y%10)
            System.out.printf("lastDigit(%d, %d) -> true",x,y);
        else{
            System.out.printf("lastDigit(%d, %d) -> false",x,y);
        }
    }
}
