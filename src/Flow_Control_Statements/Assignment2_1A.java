package Flow_Control_Statements;
//A) Write a program to check if a given integer number is Positive, Negative, or Zero.
public class Assignment2_1A {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        if(x==0)
            System.out.println("Zero");
        else if(x>0)
            System.out.println("Positive");
        else{
            System.out.println("Negative");
        }
    }
}
