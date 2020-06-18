package Flow_Control_Statements;
//Write a program to check if a given integer number is odd or even.
public class Assignment2_2 {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        if(x%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
