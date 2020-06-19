package Flow_Control_Statements;
/*
Initialize a character variable in a program and

print 'Alphabhet' if the initialized value is an alphabhet,

print 'Digit' if the initialized value is a number, and

print 'Special Character', if the initialized value is anything else.

input single char form user

 */
import java.util.Scanner;

public class Assignment2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c1=sc.next().charAt(0);
        if((c1>='a' &&c1<='z') || (c1>='A' && c1<='Z') )
            System.out.println("Alphabhet");
        else if(c1>='0' && c1<='9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
